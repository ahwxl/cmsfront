package com.bplow.netconn.newcms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bplow.netconn.newcms.domain.FmContent;
import com.bplow.netconn.newcms.domain.TplDecisionDomain;
import com.bplow.netconn.newcms.domain.TplEnum;
import com.bplow.netconn.newcms.service.CmsService;
import com.bplow.netconn.newcms.service.TplDecisionService;

@Service("tplDecisionSeviceImpl")
public class TplDecisionServiceImpl implements TplDecisionService{
	
	@Autowired
	private CmsService cmsService;

	@Override
	public TplDecisionDomain processCatalog(String catalogId) {
		String tmpstr = null;
		List<FmContent> list = cmsService.getContentListByCatalog(catalogId);
		TplDecisionDomain tpl = new TplDecisionDomain();
		tpl.setTplEnum(TplEnum.create(list.size()));
		if(null != list && list.size() ==1){
			FmContent cnt = list.get(0);
			tpl.setId(cnt.getId());
		}else{
			tpl.setId(catalogId);
		}
		
		return tpl;
	}

	@Override
	public String processProduct(String id) {
		
		
		
		
		return null;
	}
	
	
	

}
