package com.bplow.netconn.newcms.dao;

import java.util.List;

import com.bplow.netconn.newcms.domain.FmContent;

public interface ContentJdbcDao {
	
	/**
	 * 获取文章内容
	 * @param id
	 * @return
	 */
	public FmContent getContentById(String id);
	
	/**
	 * 获取文字列表
	 * @param cnt
	 * @return
	 */
	public List getContentList(FmContent cnt);

}
