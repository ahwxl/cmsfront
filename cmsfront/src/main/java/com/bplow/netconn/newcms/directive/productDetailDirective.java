package com.bplow.netconn.newcms.directive;


import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bplow.netconn.base.dao.result.Result;
import com.bplow.netconn.newcms.dao.ProductDao;
import com.bplow.netconn.newcms.domain.FmContent;
import com.bplow.netconn.newcms.domain.FmProduct;
import com.bplow.netconn.newcms.service.CmsService;

import freemarker.core.Environment;
import freemarker.template.ObjectWrapper;
import freemarker.template.SimpleScalar;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateDirectiveModel;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;

@Service("productDetailDirective")
public class productDetailDirective implements TemplateDirectiveModel{

	private static Logger logger = LoggerFactory.getLogger(productDetailDirective.class);
	
	@Autowired
	private CmsService cmsService;
	
	@Override
	public void execute(Environment env, Map map, TemplateModel[] tm,
			TemplateDirectiveBody body) throws TemplateException, IOException {
		logger.info("展示产品详细列表标签:begin");
		FmProduct product = new FmProduct();
		Object templatemodel = map.get("catalogId");
		if(templatemodel instanceof freemarker.template.SimpleScalar){
			SimpleScalar ss = ((SimpleScalar) templatemodel);
			product.setCatalogId( ss.getAsString() );
		}
		FmProduct aimproduct = null;
		String pagecontent   = null;
		Result rst = cmsService.getProductById(product.getCatalogId());
		if(rst.isSuccess){
			aimproduct = (FmProduct)rst.getResultObj();
			pagecontent = IOUtils.toString(aimproduct.getContent(),"GBK");
		}else{
			pagecontent ="没有内容展示";
		}
		
		env.setVariable("product", ObjectWrapper.DEFAULT_WRAPPER.wrap(aimproduct));
		env.setVariable("pagecontent", ObjectWrapper.DEFAULT_WRAPPER.wrap(pagecontent));
		body.render(env.getOut());
		logger.info("展示产品详细标签:{0}",product.getCatalogId());
	}

}
 