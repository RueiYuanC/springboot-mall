package com.slow.springbootmall.service;

import com.slow.springbootmall.dto.CreateOrderRequest;
import com.slow.springbootmall.dto.OrderQueryParams;
import com.slow.springbootmall.model.Order;

import java.util.List;

public interface OrderService {
    Integer countOrder(OrderQueryParams orderQueryParams);
    List<Order> getOrders(OrderQueryParams orderQueryParams);
    Order getOrderById(Integer orderId);
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
