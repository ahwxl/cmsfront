package com.bplow.netconn.newcms.service;

import com.bplow.netconn.newcms.domain.TplDecisionDomain;

public interface TplDecisionService {
	
	
	/**
	 * 决策 当点击目录（文章or产品类型）时，如果该目录下只有一篇文章，则直接返回文章详情模板路径
	 * 否则返回文章列表or产品列表
	 * @param catalogId
	 * @return
	 */
	public TplDecisionDomain processCatalog(String catalogId);
	
	
	
	public String processProduct(String id);

}
