package com.slow.springbootmall.service;

import com.slow.springbootmall.dto.ProductQueryParams;
import com.slow.springbootmall.dto.ProductRequset;
import com.slow.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    Integer countProduct(ProductQueryParams productQueryParams);
    List<Product>  getProducts(ProductQueryParams productQueryParams);
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequset productRequset);

    void updateProduct(Integer productId,ProductRequset productRequset);

    void deleteProductById(Integer productId);
}
