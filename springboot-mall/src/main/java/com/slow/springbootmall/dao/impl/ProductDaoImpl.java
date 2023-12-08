package com.slow.springbootmall.dao.impl;

import com.slow.springbootmall.dao.ProductDao;
import com.slow.springbootmall.dto.ProductRequset;
import com.slow.springbootmall.model.Product;
import com.slow.springbootmall.rowmapper.ProductRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ProductDaoImpl implements ProductDao {
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    @Override
    public Product getProductById(Integer productId) {
        String sql="SELECT product_id,product_name,category,image_url,price,stock,description,created_date,last_modified_date" +
                " FROM product WHERE product_id = :productId";

        Map<String,Object> map=new HashMap<>();
        map.put("productId",productId);
        List<Product> productList = namedParameterJdbcTemplate.query(sql, map, new ProductRowMapper());

        if (productList.size()>0){
            return productList.get(0);
        }else {
            return null;
        }

    }

    @Override
    public Integer createProduct(ProductRequset productRequset) {
        String sql="INSERT INTO product(product_name,category,image_url,price,stock,description,created_date,last_modified_date)" +
                " VALUES (:productName, :category, :imageUrl, :price, :stock, :description, :createDate, :lastModifiedDate)";

        Map<String, Object> map=new HashMap<>();
        map.put("productName",productRequset.getProductName());
        map.put("category",productRequset.getCategory().name());
        map.put("imageUrl",productRequset.getImageUrl());
        map.put("price",productRequset.getPrice());
        map.put("stock",productRequset.getStock());
        map.put("description",productRequset.getDescription());
        Date now =new Date();
        map.put("createDate",now);
        map.put("lastModifiedDate",now);

        KeyHolder keyHolder=new GeneratedKeyHolder();
        namedParameterJdbcTemplate.update(sql,new MapSqlParameterSource(map),keyHolder);
        int productId=keyHolder.getKey().intValue();
        return productId;
    }

    @Override
    public void updateProduct(Integer productId, ProductRequset productRequset) {
        String sql="UPDATE product SET product_name = :productName,category = :category,image_url = :imageUrl," +
                "price = :price,stock = :stock,description = :description,last_modified_date = :lastModifiedDate" +
                " WHERE product_id = :productId";
        Map<String, Object> map=new HashMap<>();
        map.put("productId",productId);
        map.put("productName",productRequset.getProductName());
        map.put("category",productRequset.getCategory().name());
        map.put("imageUrl",productRequset.getImageUrl());
        map.put("price",productRequset.getPrice());
        map.put("stock",productRequset.getStock());
        map.put("description",productRequset.getDescription());
        map.put("lastModifiedDate",new Date());
        namedParameterJdbcTemplate.update(sql,map);
    }

    @Override
    public void deleteProductById(Integer productId) {
        String sql="DELETE FROM product WHERE product_id = :productId ";
        Map<String, Object> map=new HashMap<>();
        map.put("productId",productId);
        namedParameterJdbcTemplate.update(sql,map);
    }
}
