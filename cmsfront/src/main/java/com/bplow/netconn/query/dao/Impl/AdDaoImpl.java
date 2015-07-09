package com.bplow.netconn.query.dao.Impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bplow.netconn.query.dao.AdDao;
import com.bplow.netconn.query.dao.entity.Ad;
import com.ibatis.sqlmap.client.SqlMapClient;

@Component
public class AdDaoImpl implements AdDao{

	@Autowired
	private SqlMapClient sqlMapClient;
	
	@Override
	public void insertAd(Ad ad) throws SQLException {
		sqlMapClient.insert("insertAd",ad);
	}

	@Override
	public Ad queryAd(int id) throws SQLException {
		Map para = new HashMap();
		para.put("id", id);
		Ad ad = (Ad)sqlMapClient.queryForObject("queryAdById", id);
		return ad;
	}
	
	public int delAd(int id) throws SQLException {
		Map para = new HashMap();
		para.put("id", id);
		int ad = sqlMapClient.delete("delAd", id);
		return ad;
	}
	
	public int upateAd(int id) throws SQLException {
		Map para = new HashMap();
		para.put("id", id);
		int tmpid = sqlMapClient.update("queryAdById", id);
		return tmpid;
	}

	@Override
	public List queryAdList(Ad ad) throws SQLException {
		List list = sqlMapClient.queryForList("queryAdForList",ad);
		return list;
	}

}
