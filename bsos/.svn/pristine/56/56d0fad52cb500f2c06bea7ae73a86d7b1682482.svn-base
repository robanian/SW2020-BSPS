package com.bsos.order;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bsos.cart.Product;

@Service
public interface OrderService {
	public List<Product> directOrder(Product product);
	public List<Product> cartOrder();
	public String createOrderName(List<Product> products);
	public int getTotalPrice(List<Product> productList);
}
