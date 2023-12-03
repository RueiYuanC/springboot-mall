package com.slow.springbootmall.dao;

import com.slow.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}
