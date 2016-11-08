package dao;

import java.util.List;

import entity.Order;

public interface OrderDao {
	void save(Order order);
	List<Order> findByUsername(String username);
}
