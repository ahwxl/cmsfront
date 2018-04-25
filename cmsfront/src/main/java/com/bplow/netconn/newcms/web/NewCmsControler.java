package com.bplow.netconn.newcms.web;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bplow.netconn.newcms.domain.TplDecisionDomain;
import com.bplow.netconn.newcms.service.TplDecisionService;


@Controller
public class NewCmsControler {
	
	Logger log = LoggerFactory.getLogger(NewCmsControler.class);
	
	@Autowired
	private TplDecisionService tplDecisionService;
	
	
	
	@RequestMapping(value = "/mainScreen",  produces = "text/html;charset=UTF-8")
	public String mainScreen(){
		
		
		return "dc_cms/mainScreen";
	}
	
	
	@RequestMapping(value = "/prodlist/{catalogId}.htm", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
	public String productList(@PathVariable("catalogId") String catalogId,Map<String, Object> model,
			HttpServletRequest request, HttpServletResponse respose){
		log.info("请求参数是：{}",catalogId); 
		model.put("catalogId", catalogId);
		
		return "cms/productlist";
	}
	
	@RequestMapping(value = "/productdetail/{productId}_{pageId}.htm", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
	public String productDetail(@PathVariable("productId") String productId,@PathVariable("pageId") String pageId,Map<String, Object> model,
			HttpServletRequest request, HttpServletResponse respose){
		log.info("请求参数是：{},{}",productId,pageId);
		model.put("catalogId", productId);
		return "cms/productdetail";
	}
	
	/**
	 * 展示文章列表，如果文章数为1，则直接展示
	 * @param catalogId
	 * @param model
	 * @param request
	 * @param respose
	 * @return
	 */
	@RequestMapping(value = "/contentlist/{catalogId}.htm", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
	public String contentList(@PathVariable("catalogId") String catalogId,Map<String, Object> model,
			HttpServletRequest request, HttpServletResponse respose){
		log.info("请求参数是：{}", catalogId);
		String tplpath = null;
		
		
		TplDecisionDomain tpl = tplDecisionService.processCatalog(catalogId);
		tplpath = tpl.getTplEnum().getTmlPath();

		/*可能是目录id 或者 文章的id*/
		catalogId = tpl.getId();
		
		model.put("catalogId", catalogId);
		model.put("id", catalogId);
		log.info("请求返回：catalogId={},tmlPath={}", catalogId,tplpath);
		return tplpath;
	}
	
	
	@RequestMapping(value = "/contentdetail/{contentId}.htm", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
	public String contentDetail(@PathVariable("contentId") String contentId,Map<String, Object> model,
			HttpServletRequest request, HttpServletResponse respose){
		log.info("请求参数是：{}", contentId);
		
		model.put("id", contentId);
		
		return "dc_cms/contentpage";
	}

}
