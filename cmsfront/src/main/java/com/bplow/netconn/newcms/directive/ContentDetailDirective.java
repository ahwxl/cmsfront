package com.bplow.netconn.newcms.directive;

import java.io.IOException;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bplow.netconn.newcms.dao.ContentJdbcDao;
import com.bplow.netconn.newcms.domain.FmContent;

import freemarker.core.Environment;
import freemarker.ext.beans.StringModel;
import freemarker.template.ObjectWrapper;
import freemarker.template.SimpleScalar;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateDirectiveModel;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;

/**
 * 文字内容展示标签
 * @author wb-wangxiaolei.xl
 *
 */

@Service
public class ContentDetailDirective implements TemplateDirectiveModel{

    private static Logger logger = LoggerFactory.getLogger(ContentListDirective.class);
	
	@Autowired
	private ContentJdbcDao contentJdbcDao;
	
	
	@Override
	public void execute(Environment env, Map params, TemplateModel[] loopVars,
			TemplateDirectiveBody body) throws TemplateException, IOException {
		String id = null;
		String pagecontent = null;
		Object templatemodel = params.get("id");
		if(templatemodel instanceof freemarker.template.SimpleScalar){
			SimpleScalar ss = ((SimpleScalar) templatemodel);
			id = ss.getAsString();
		}
		FmContent cnt = contentJdbcDao.getContentById(id);
		
		pagecontent = IOUtils.toString(cnt.getContent(),"GBK");
		
		env.setVariable("content", ObjectWrapper.DEFAULT_WRAPPER.wrap(cnt));
		
		env.setVariable("pagecontent", ObjectWrapper.DEFAULT_WRAPPER.wrap(pagecontent));
		
		body.render(env.getOut());
		
		logger.info("ContentDetailDirective 参数id[{}]",id);
	}

}
