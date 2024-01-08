package com.slow.springbootmall.dao;

import com.slow.springbootmall.dto.ProductQueryParams;
import com.slow.springbootmall.dto.ProductRequest;
import com.slow.springbootmall.model.Product;

import java.util.Iterator;
import java.util.List;

public interface ProductDao {
    Integer countProduct(ProductQueryParams productQueryParams);
    List<Product> getProducts(ProductQueryParams productQueryParams);
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequset);
    void updateProduct(Integer productId, ProductRequest productRequset);
    void updateStock(Integer prodcutId, Integer stock);
    void deleteProductById(Integer productId);
}
