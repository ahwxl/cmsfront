package com.bplow.netconn.newcms.directive;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bplow.netconn.newcms.domain.FmCatalog;
import com.bplow.netconn.newcms.service.CmsService;

import freemarker.core.Environment;
import freemarker.template.ObjectWrapper;
import freemarker.template.SimpleScalar;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateDirectiveModel;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;

@Service("catalogNavigationDirective")
public class CatalogNavigationDirective implements TemplateDirectiveModel{

	private static Logger logger = LoggerFactory.getLogger(CatalogNavigationDirective.class);
	
	@Autowired
	private CmsService cmsService;
	
	@Override
	public void execute(Environment env, Map map, TemplateModel[] tm,
			TemplateDirectiveBody body) throws TemplateException, IOException {
		logger.info("展示目录导航列表标签:begin");
		FmCatalog catalog = new FmCatalog();
		Object templatemodel = map.get("catalogId");
		if(templatemodel instanceof freemarker.template.SimpleScalar){
			SimpleScalar ss = ((SimpleScalar) templatemodel);
			catalog.setParentCatalogId( ss.getAsString() );
		}
		
		List list = cmsService.queryAllCatalogByP(catalog.getParentCatalogId());
		
		
		env.setVariable("cataloglist", ObjectWrapper.DEFAULT_WRAPPER.wrap(list));
		body.render(env.getOut());
		logger.info("展示产品列表标签:{0}",catalog.getParentCatalogId());
		
	}

}
