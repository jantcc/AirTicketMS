package service;

import java.util.List;

import entity.Order;

public interface OrderService {
	void save(Order order);
	List<Order> findByUsername(String username);
	List<Order> findAll();
	List<Order> findReturnOrder();
	void delOrder(int id);
	void updatestatustoreturn(int id);
	List<Order> findById(int id,String username);
	List<Order> findByDate(String time,String username);
}
