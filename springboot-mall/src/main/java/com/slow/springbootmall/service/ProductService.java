package com.slow.springbootmall.service;

import com.slow.springbootmall.dto.ProductRequset;
import com.slow.springbootmall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequset productRequset);
}
