package com.unir.orders.service;


import com.unir.orders.model.request.OrderRequest;

public interface OrderService {
  String createOrder(OrderRequest request);
}
