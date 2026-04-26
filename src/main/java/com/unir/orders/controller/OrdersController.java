package com.unir.orders.controller;


import com.unir.orders.model.request.OrderRequest;
import com.unir.orders.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrdersController {
  private final OrderService service;

  @PostMapping("/orders")
  public ResponseEntity<String> createOrder(@RequestBody OrderRequest request) {
    String result = service.createOrder(request);

    if (request != null) {
      return ResponseEntity.ok(result);
    } else {
      return ResponseEntity.badRequest().build();
    }
  }
}
