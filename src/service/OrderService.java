package service;

import java.util.List;

import entity.Order;

public interface OrderService {
	void save(Order order);
	List<Order> findByUsername(String username);
}
