package com.bplow.netconn.newcms.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.bplow.netconn.newcms.dao.CatalogDao;
import com.bplow.netconn.newcms.domain.FmCatalog;

@Service
public class CatalogDaoImpl implements CatalogDao{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	String queryCatalogByIdSQL = "select * from fm_catalog a where a.catalog_id=? ";
	
	String catalogListsql="select a.catalog_id,a.catalog_name,a.order_id,a.parent_catalog_id,b.catalog_id p_catalog_id,b.catalog_name p_catalog_name,b.parent_catalog_id pp_catalog_id,b.order_id p_order_id from fm_catalog a "+
    "right join "+
    "(select bb.catalog_id,bb.catalog_name,bb.order_id from fm_catalog bb where bb.parent_catalog_id= ? )b on a.parent_catalog_id= b.catalog_id ";
	
	String catalogListSql2="select a.catalog_id,a.catalog_name,a.order_id,a.parent_catalog_id,a.catalog_type  from fm_catalog a "+
		"right join "+
		"(select bb.catalog_id,bb.catalog_name,bb.order_id,bb.parent_catalog_id from fm_catalog bb where bb.parent_catalog_id= ? )b on a.parent_catalog_id= b.catalog_id "+
		"where a.catalog_id is not null "+
		"union all "+
		"select bb.catalog_id,bb.catalog_name,bb.order_id,bb.parent_catalog_id,bb.catalog_type  from fm_catalog bb ";
	
	@Override
	public FmCatalog queryCatalogById(String id) {
		
		return jdbcTemplate.queryForObject(queryCatalogByIdSQL, new RowMapper<FmCatalog>() {
            public FmCatalog mapRow(ResultSet rs, int rowNum) throws SQLException {
            	FmCatalog cnt = new FmCatalog();
            	cnt.setCatalogId(rs.getString("catalog_id"));
            	cnt.setCatalogName(rs.getString("catalog_name"));
            	cnt.setOrderId(rs.getInt("order_id"));
            	cnt.setParentCatalogId(rs.getString("parent_catalog_id"));
            	cnt.setCatalogType(rs.getString("catalog_type"));
                return cnt;
            }
        },id);
	}

	@Override
	public List queryCatalogList(FmCatalog catalog) {
		
		return jdbcTemplate.query(catalogListSql2, new RowMapper<FmCatalog>() {
            public FmCatalog mapRow(ResultSet rs, int rowNum) throws SQLException {
            	FmCatalog cnt = new FmCatalog();
            	cnt.setCatalogId(rs.getString("catalog_id"));
            	cnt.setCatalogName(rs.getString("catalog_name"));
            	cnt.setOrderId(rs.getInt("order_id"));
            	cnt.setParentCatalogId(rs.getString("parent_catalog_id"));
            	cnt.setCatalogType(rs.getString("catalog_type"));
                return cnt;
            }
        },catalog.getParentCatalogId());
	}

	@Override
	public String addCatalog(FmCatalog catalog) {
		return null;
	}

	@Override
	public String updateCatalog(FmCatalog catalog) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delCatalog(FmCatalog catalog) {
		// TODO Auto-generated method stub
		return null;
	}

}
