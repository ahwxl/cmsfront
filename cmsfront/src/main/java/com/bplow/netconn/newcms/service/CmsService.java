package com.bplow.netconn.newcms.service;

import java.util.List;

import com.bplow.netconn.base.dao.result.Result;
import com.bplow.netconn.newcms.domain.FmCatalog;
import com.bplow.netconn.newcms.domain.FmContent;
import com.bplow.netconn.newcms.domain.FmProduct;

public interface CmsService {
	
	/**
	 * 查询父目录下所有子目录
	 * @param catalogId
	 * @return
	 */
	public List queryAllCatalogByP(String catalogId);
	
	
	/**
	 * 获取父目录下第一级子目录列表
	 * @param pcatalogId
	 * @return
	 */
	public List getCatalogList(String pcatalogId);
	
	/**
	 * 获取文章内容
	 * @param cntId
	 * @return
	 */
	public Result getContentById(String cntId);
	
	/**
	 * 获取文章列表
	 * @param catalogId
	 * @return
	 */
	public List getContentListByCatalog(String catalogId);
	
	/**
	 * 获取目录信息
	 * @param id
	 * @return
	 */
	public FmCatalog getCatalogById(String id);
	
	/**
	 * 获取产品
	 * @param id
	 * @return
	 */
	public Result getProductById(String id);
	
	

}
