package service;

import entity.Company;

public interface CompanyService {
	void save(Company company);
	Company find(String companycode);
}
