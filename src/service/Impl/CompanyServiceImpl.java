package service.Impl;

import java.util.List;

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

	public List<Company> findAll() {
		// TODO Auto-generated method stub
		return this.companyDao.findAll();
	}

	public Company find(int id) {
		// TODO Auto-generated method stub
		return this.companyDao.find(id);
	}

	public Company findByname(String companyname) {
		// TODO Auto-generated method stub
		return this.companyDao.findByname(companyname);
	}

}
