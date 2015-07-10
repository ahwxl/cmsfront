package com.bplow.netconn.newcms.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.lob.LobHandler;
import org.springframework.stereotype.Service;

import com.bplow.netconn.newcms.dao.ContentJdbcDao;
import com.bplow.netconn.newcms.domain.FmContent;

@Service("contentJdbcDao")
public class ContentJdbcDaoImpl implements ContentJdbcDao{

	@Autowired
	private LobHandler lobHandler;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	/**
	 * 获取单条文章内容
	 */
	String queryContentSql = "select a.cnt_caption,a.content,a.operate_date from fm_content a where a.id = ? ";
	/**
	 * 获取文字列表
	 */
	String queryContentListSql ="select a.id,a.cnt_caption,a.operate_date  from fm_content a where a.catalog_id = ? ";
	
	
	@Override
	public FmContent getContentById(String id) {
		
		return jdbcTemplate.queryForObject(queryContentSql/*,new String[]{tablename}*/, new RowMapper<FmContent>() {
            public FmContent mapRow(ResultSet rs, int rowNum) throws SQLException {
            	FmContent cnt = new FmContent();
                cnt.setCntCaption(rs.getString("cnt_caption"));
                cnt.setContent(lobHandler.getBlobAsBytes(rs, "content"));
                cnt.setOperateDate(rs.getDate("operate_date"));
                return cnt;
            }
        },id);
	}

	@Override
	public List<FmContent> getContentList(FmContent cnt) {
		
		return jdbcTemplate.query(queryContentListSql, new RowMapper<FmContent>() {
            public FmContent mapRow(ResultSet rs, int rowNum) throws SQLException {
            	FmContent cnt = new FmContent();
            	cnt.setId(rs.getString("id"));
                cnt.setCntCaption(rs.getString("cnt_caption"));
                cnt.setOperateDate(rs.getDate("operate_date"));
                return cnt;
            }
        },cnt.getCatalogId());
	}

}
