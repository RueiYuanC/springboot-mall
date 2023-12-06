package com.slow.springbootmall.dao;

import com.slow.springbootmall.dto.ProductRequset;
import com.slow.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequset productRequset);
}
