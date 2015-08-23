package com.bplow.netconn.newcms.intercaptor;

import java.io.Serializable;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;

import com.bplow.netconn.base.dao.result.Result;

/**
 *拦截数据库操作异常，或service 处理异常 
 * @author qian
 *
 */
public class RepositoryExecuteResultInterceptor implements MethodInterceptor, Serializable{

	Logger log = LoggerFactory.getLogger("commonError");
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 745927829073322855L;

	@Override
	public Object invoke(MethodInvocation mothodInvocation) throws Throwable {
		Object resultObj = null;
		try {
			resultObj = mothodInvocation.proceed();
		}catch(EmptyResultDataAccessException e){
			haddleExcaption(resultObj ,e);
			e.printStackTrace();
			log.info("处理异常:{}",e);
			return resultObj;
		}
		catch (Exception e) {
			haddleExcaption(resultObj ,e);
			e.printStackTrace();
			log.info("处理异常:{}",e);
			return resultObj;
		}finally{
			
		}
		
		
		return resultObj;
	}
	
	public void haddleExcaption(Object resultObj,Exception e){
		if(null == resultObj){
			Result tmpRulst = new Result();
			tmpRulst.setSuccess(false);
			tmpRulst.setResultCode("");
			tmpRulst.setResultMessage(e.getMessage());
			
			resultObj = tmpRulst;
		}
	}

}
