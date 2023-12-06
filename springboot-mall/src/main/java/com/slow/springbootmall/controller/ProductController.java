package com.slow.springbootmall.controller;

import com.slow.springbootmall.dto.ProductRequset;
import com.slow.springbootmall.model.Product;
import com.slow.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products/{productId}")
    public ResponseEntity<Product> getProduct(@PathVariable Integer productId){
        Product product=productService.getProductById(productId);
        if (product!=null){
            return ResponseEntity.status(HttpStatus.OK).body(product);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PostMapping("/products")
    public ResponseEntity<Product> createProduct(@RequestBody @Valid ProductRequset productRequset){
       Integer productId=productService.createProduct(productRequset);
       Product product=productService.getProductById(productId);
       return  ResponseEntity.status(HttpStatus.CREATED).body(product);
    }

}
