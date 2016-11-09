package dao;

import java.util.List;

import entity.Order;

public interface OrderDao {
	void save(Order order);
	List<Order> findByUsername(String username);
	List<Order> findAll();
	List<Order> findReturnOrder();
	void delOrder(int id);
	void updatestatustoreturn(int id);
	List<Order> findById(int id,String username);
	List<Order> findByDate(String time,String username);
}
