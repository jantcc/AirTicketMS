package dao;

import entity.Company;

public interface CompanyDao {
	void save(Company company);
	Company find(String companycode);
}
