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
	
	private String queryProdListForTwoLevel = "select a.product_id,a.product_name,a.product_desc,a.product_image_url from ( select cg.catalog_id from fm_catalog cg where cg.catalog_id = ? union all select gl.catalog_id from fm_catalog gl where gl.parent_catalog_id = ? ) ctl left join fm_product a  on ctl.catalog_id = a.catalog_id where a.product_id is not null ";
	
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
		
		
		return jdbcTemplate.query(queryProdListForTwoLevel, new RowMapper<FmProduct>() {
            public FmProduct mapRow(ResultSet rs, int rowNum) throws SQLException {
            	FmProduct cnt = new FmProduct();
            	cnt.setId(rs.getLong("product_id"));
            	cnt.setProductName(rs.getString("product_name"));
            	cnt.setProductDesc(rs.getString("product_desc"));
            	cnt.setProductImageUrl(rs.getString("product_image_url"));

                return cnt;
            }
        },product.getCatalogId(),product.getCatalogId());
	}

}
