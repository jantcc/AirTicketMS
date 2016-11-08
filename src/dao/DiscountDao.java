package dao;

import entity.Discount;

public interface DiscountDao {
	void save(Discount discout);
	Discount findByCompanyid(int id);
}
