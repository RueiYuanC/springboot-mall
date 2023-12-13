package com.slow.springbootmall.dao;

import com.slow.springbootmall.constant.ProductCategory;
import com.slow.springbootmall.dto.ProductQueryParams;
import com.slow.springbootmall.dto.ProductRequset;
import com.slow.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {
    List<Product> getProducts(ProductQueryParams productQueryParams);
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequset productRequset);
    void updateProduct(Integer productId,ProductRequset productRequset);
    void deleteProductById(Integer productId);
}
