package service;

import entity.Discount;

public interface DiscountService {
	void save(Discount discout);
	Discount findByCompanyid(int id);
}
