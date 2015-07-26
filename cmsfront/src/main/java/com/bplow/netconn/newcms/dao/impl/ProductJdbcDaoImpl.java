package com.bplow.netconn.newcms.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.lob.LobHandler;
import org.springframework.stereotype.Service;

import com.bplow.netconn.newcms.dao.ProductDao;
import com.bplow.netconn.newcms.domain.FmProduct;

@Service
public class ProductJdbcDaoImpl implements ProductDao{

	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	private LobHandler lobHandler;
	
	private String queryProductlistsql ="select a.product_id,a.product_name,a.product_desc,a.product_image_url from fm_product a ";
	
	private String queryProductById = "select a.product_id,a.product_name,a.content from fm_product a where a.product_id = ? ";
	
	@Override
	public FmProduct queryById(String id) {
		return jdbcTemplate.queryForObject(queryProductById, new RowMapper<FmProduct>() {
            public FmProduct mapRow(ResultSet rs, int rowNum) throws SQLException {
            	FmProduct cnt = new FmProduct();
            	cnt.setId(rs.getLong("product_id"));
            	cnt.setProductName(rs.getString("product_name"));
                cnt.setContent(lobHandler.getBlobAsBytes(rs, "content"));
                return cnt;
            }
        },id);
	}

	@Override
	public List<FmProduct> queryList(FmProduct product) {
		
		
		return jdbcTemplate.query(queryProductlistsql, new RowMapper<FmProduct>() {
            public FmProduct mapRow(ResultSet rs, int rowNum) throws SQLException {
            	FmProduct cnt = new FmProduct();
            	cnt.setId(rs.getLong("product_id"));
            	cnt.setProductName(rs.getString("product_name"));
            	cnt.setProductDesc(rs.getString("product_desc"));
            	cnt.setProductImageUrl(rs.getString("product_image_url"));

                return cnt;
            }
        });
	}

}
