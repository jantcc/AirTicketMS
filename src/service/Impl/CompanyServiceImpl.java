package service.Impl;

import dao.CompanyDao;
import entity.Company;
import service.CompanyService;

public class CompanyServiceImpl implements CompanyService {
	private CompanyDao companyDao;
	
	public CompanyDao getCompanyDao() {
		return companyDao;
	}

	public void setCompanyDao(CompanyDao companyDao) {
		this.companyDao = companyDao;
	}

	public void save(Company company) {
		// TODO Auto-generated method stub
		this.companyDao.save(company);
	}

	public Company find(String companycode) {
		// TODO Auto-generated method stub
		return this.companyDao.find(companycode);
	}

}
