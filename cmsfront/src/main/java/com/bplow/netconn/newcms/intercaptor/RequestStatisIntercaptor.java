package com.bplow.netconn.newcms.intercaptor;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.servlet.resource.ResourceHttpRequestHandler;

import com.bplow.netconn.newcms.annotation.AccessRequired;

public class RequestStatisIntercaptor extends HandlerInterceptorAdapter{
	
	Logger log = LoggerFactory.getLogger(RequestStatisIntercaptor.class);

	public boolean preHandle(HttpServletRequest request,
            HttpServletResponse response, Object handler) throws Exception {
		//log.info("用户权限判读：@AccessRequired");
		//获取请求的URL判读是否是 en.techwellglobal.com 如果是则展示英文站点
		StringBuffer url = request.getRequestURL();
		url.delete(0, 6);//删除http://
		String tempContextUrl = url.delete(url.length() - request.getRequestURI().length(), url.length()).toString();
		if(tempContextUrl.contains("en.")){//展示英文站点
			request.setAttribute("webCatalogId", "8380c59932414743af80f8e3ec03c9da");
			request.setAttribute("isEnglist", true);
		}else{//展示中文站点
			request.setAttribute("isEnglist", false);
			request.setAttribute("webCatalogId", "44209a93d0ca46e7b2643cfceb6c9e5e");
		}
		
		if(handler instanceof ResourceHttpRequestHandler){
			return true;
		}else if(handler instanceof HandlerMethod){
			HandlerMethod handlerMethod = (HandlerMethod) handler;
	        Method method = handlerMethod.getMethod();
	        AccessRequired annotation = method.getAnnotation(AccessRequired.class);
	        if (annotation != null) {
	           log.info("你遇到了：@AccessRequired");
	           String accessToken = request.getParameter("access_token");
	            /**
	             * Do something
	             */
	            response.getWriter().write("没有通过拦截，accessToken的值为：" + accessToken);
	        }
		}
        //没有注解通过拦截
        return true;
    }
	
	
}
