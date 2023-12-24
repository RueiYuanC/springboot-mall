package com.slow.springbootmall.service.impl;

import com.slow.springbootmall.dao.ProductDao;
import com.slow.springbootmall.dto.ProductQueryParams;
import com.slow.springbootmall.dto.ProductRequest;
import com.slow.springbootmall.model.Product;
import com.slow.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;

    @Override
    public Integer countProduct(ProductQueryParams productQueryParams) {
        return productDao.countProduct(productQueryParams);
    }

    @Override
    public List<Product> getProducts(ProductQueryParams productQueryParams) {
        return productDao.getProducts(productQueryParams);
    }

    @Override
    public Product getProductById(Integer productId) {
                return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequset) {
        return productDao.createProduct(productRequset);
    }

    @Override
    public void updateProduct(Integer productId, ProductRequest productRequset) {
        productDao.updateProduct(productId,productRequset);
    }

    @Override
    public void deleteProductById(Integer productId) {
        productDao.deleteProductById(productId);
    }


}
