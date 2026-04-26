package com.unir.orders.service;


import com.unir.orders.facade.ProductsFacade;
import com.unir.orders.model.pojo.Product;
import com.unir.orders.model.request.OrderRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
  @Autowired //inlcuir esto hace que no sea necesario incluir el final abajo
  private ProductsFacade productsFacade;

  @Override
  public String createOrder(OrderRequest request) {
    List<Product> products = request.getProducts().stream().map(productsFacade::getProduct).filter(Objects::nonNull).collect(Collectors.toList());
    return products.size() == request.getProducts().size() ? "OK" : "KO";
  }
}
