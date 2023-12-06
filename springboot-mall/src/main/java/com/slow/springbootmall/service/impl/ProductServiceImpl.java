package com.slow.springbootmall.service.impl;

import com.slow.springbootmall.dao.ProductDao;
import com.slow.springbootmall.dto.ProductRequset;
import com.slow.springbootmall.model.Product;
import com.slow.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
                return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequset productRequset) {
        return productDao.createProduct(productRequset);
    }
}
