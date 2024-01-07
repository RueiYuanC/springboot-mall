package com.slow.springbootmall.service;

import com.slow.springbootmall.dto.CreateOrderRequest;
import com.slow.springbootmall.model.Order;

public interface OrderService {
    Order getOrderById(Integer orderId);
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
