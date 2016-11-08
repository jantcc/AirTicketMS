package service;

import java.util.List;

import entity.Company;

public interface CompanyService {
	void save(Company company);
	Company find(String companycode);
	Company find(int id);
	List<Company> findAll();
	Company findByname(String companyname);
}
