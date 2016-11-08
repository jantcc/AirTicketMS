package dao;

import java.util.List;

import entity.Company;

public interface CompanyDao {
	void save(Company company);
	Company find(String companycode);
	Company find(int id);
	List<Company> findAll();
	Company findByname(String companyname);
}
