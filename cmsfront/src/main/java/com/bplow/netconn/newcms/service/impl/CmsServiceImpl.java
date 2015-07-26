package com.bplow.netconn.newcms.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.bplow.netconn.base.dao.result.Result;
import com.bplow.netconn.newcms.dao.CatalogDao;
import com.bplow.netconn.newcms.dao.ContentDao;
import com.bplow.netconn.newcms.dao.ContentJdbcDao;
import com.bplow.netconn.newcms.dao.ProductDao;
import com.bplow.netconn.newcms.domain.FmCatalog;
import com.bplow.netconn.newcms.domain.FmContent;
import com.bplow.netconn.newcms.domain.FmProduct;
import com.bplow.netconn.newcms.service.CmsService;

@Service
public class CmsServiceImpl implements CmsService{
	
	@Autowired
	CatalogDao catalogDao;
	//@Autowired
	ContentDao contentDao;
	@Autowired
	ContentJdbcDao contentJdbcDao;
	@Autowired
	ProductDao productDao;
	
	public List getCatalogList(String pcatalogId){
		
		
		return null;
	}

	@Override
	public List queryAllCatalogByP(String catalogId) {
		Assert.notNull(catalogId, "父catalogid不能为空！");
		FmCatalog catalog = new FmCatalog();
		catalog.setParentCatalogId(catalogId);
		
		List firstLayerCatalogList = new ArrayList();
		Map<String,FmCatalog> map = new HashMap<String,FmCatalog>();
		
		
		List<FmCatalog> list = catalogDao.queryCatalogList(catalog);
		
		for(FmCatalog fcatalog : list){
			if(catalogId.equals(fcatalog.getParentCatalogId())){
				fcatalog.setChildrenNode(new HashSet());
				firstLayerCatalogList.add(fcatalog);
				map.put(fcatalog.getCatalogId(), fcatalog);
			}
		}
		
		for(FmCatalog fcatalog : list){
			FmCatalog tmpcatalog = map.get(fcatalog.getParentCatalogId());
			if(tmpcatalog != null){
				Set tmpset =tmpcatalog.getChildrenNode();
				tmpset.add(fcatalog);
			}
		}
		

		
		
		return firstLayerCatalogList;
	}

	@Override
	public Result getContentById(String cntId) {
		Result rst = new  Result(); 
		FmContent cnt = contentJdbcDao.getContentById(cntId);
		rst.setResultObj(cnt);
		return rst;
	}

	@Override
	public List getContentListByCatalog(String catalogId) {
		FmContent fmcatalog = new FmContent();
		fmcatalog.setCatalogId(catalogId);
		List list = contentJdbcDao.getContentList(fmcatalog);
		return list;
	}

	@Override
	public FmCatalog getCatalogById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result getProductById(String id) {
		Result rst = new Result();
		FmProduct product = productDao.queryById(id);
		rst.setResultObj(product);
		return rst;
	}

}
