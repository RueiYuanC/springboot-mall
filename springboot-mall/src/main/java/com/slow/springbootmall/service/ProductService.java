package com.slow.springbootmall.service;

import com.slow.springbootmall.dto.ProductQueryParams;
import com.slow.springbootmall.dto.ProductRequest;
import com.slow.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    Integer countProduct(ProductQueryParams productQueryParams);
    List<Product>  getProducts(ProductQueryParams productQueryParams);
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequset);

    void updateProduct(Integer productId, ProductRequest productRequset);

    void deleteProductById(Integer productId);
}
