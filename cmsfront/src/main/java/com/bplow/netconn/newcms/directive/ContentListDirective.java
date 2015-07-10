package com.bplow.netconn.newcms.directive;

import java.io.IOException;
import java.util.List;
import java.util.Map;

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
 * 文字列表标签
 * @author wb-wangxiaolei.xl
 *
 */
@Service("contentListDirective")
public class ContentListDirective implements TemplateDirectiveModel{

	private static Logger logger = LoggerFactory.getLogger(ContentListDirective.class);
	
	@Autowired
	private ContentJdbcDao contentJdbcDao;
	
	@Override
	public void execute(Environment env, Map params, TemplateModel[] loopVars,
			TemplateDirectiveBody body) throws TemplateException, IOException {
		String catalogId = null;
		Object templatemodel = params.get("catalogId");
		if(templatemodel instanceof freemarker.template.SimpleScalar){
			SimpleScalar ss = ((SimpleScalar) templatemodel);
			catalogId = ss.getAsString();
		}
		
		FmContent cnt = new FmContent();
		cnt.setCatalogId(catalogId);
		
		List list = contentJdbcDao.getContentList(cnt);
		
		
		env.setVariable("contentList", ObjectWrapper.DEFAULT_WRAPPER.wrap(list));
		body.render(env.getOut());
		logger.info("ContentListDirective 参数catalog_id[{}]",catalogId);
	}

}
