package service.Impl;

import java.util.List;

import dao.PlanemodelDao;
import entity.Planemodel;
import service.PlanemodelService;

public class PlanemodelServiceImpl implements PlanemodelService {
	private PlanemodelDao planemodelDao;

	public PlanemodelDao getPlanemodelDao() {
		return planemodelDao;
	}

	public void setPlanemodelDao(PlanemodelDao planemodelDao) {
		this.planemodelDao = planemodelDao;
	}

	public void addPlaneModel(Planemodel planemodel) {
		// TODO Auto-generated method stub
		this.planemodelDao.addPlaneModel(planemodel);
	}

	public List<Planemodel> FindAll() {
		// TODO Auto-generated method stub
		return this.planemodelDao.FindAll();
	}
	
}
