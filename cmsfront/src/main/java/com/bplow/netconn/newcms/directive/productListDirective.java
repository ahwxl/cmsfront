package com.bplow.netconn.newcms.directive;


import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bplow.netconn.newcms.dao.ProductDao;
import com.bplow.netconn.newcms.domain.FmProduct;

import freemarker.core.Environment;
import freemarker.template.ObjectWrapper;
import freemarker.template.SimpleScalar;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateDirectiveModel;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;

@Service("productListDirective")
public class productListDirective implements TemplateDirectiveModel{

	private static Logger logger = LoggerFactory.getLogger(productListDirective.class);
	
	@Autowired
	private ProductDao productDao;
	
	@Override
	public void execute(Environment env, Map map, TemplateModel[] tm,
			TemplateDirectiveBody body) throws TemplateException, IOException {
		logger.info("展示产品列表标签:begin");
		FmProduct product = new FmProduct();
		Object templatemodel = map.get("catalogId");
		if(templatemodel instanceof freemarker.template.SimpleScalar){
			SimpleScalar ss = ((SimpleScalar) templatemodel);
			product.setCatalogId( ss.getAsString() );
		}
		List list = productDao.queryList(product);
		
		env.setVariable("productlist", ObjectWrapper.DEFAULT_WRAPPER.wrap(list));
		body.render(env.getOut());
		logger.info("展示产品列表标签:{0}",product.getCatalogId());
	}

}
 