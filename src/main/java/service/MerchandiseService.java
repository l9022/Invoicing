package service;

import java.util.List;

import dao.IMerchandiseDao;
import domain.Merchandise;

public class MerchandiseService implements IMerchandiseService{
    private IMerchandiseDao merchandiseDao;

	public IMerchandiseDao getMerchandiseDao() {
		return merchandiseDao;
	}
	public void setMerchandiseDao(IMerchandiseDao merchandiseDao) {
		this.merchandiseDao = merchandiseDao;
	}

	@Override
	public List<Merchandise> findMerchandise(Merchandise merchandise) {
		return merchandiseDao.findMerchandise(merchandise);
	}
	
	@Override
	public void saveMerchandise(Merchandise merchandise) {
		merchandiseDao.saveMerchandise(merchandise);
	}
	
	@Override
	public List<Merchandise> findMerchandiseByCode(Merchandise merchandise) {
		return merchandiseDao.findMerchandiseByCode(merchandise);
	}
	
	@Override
	public void updateMerchandise(Merchandise merchandise) {
		this.merchandiseDao.updateMerchandise(merchandise);
	}
	
	@Override
	public void delMerchandise(int merchandise) {
		merchandiseDao.delMerchandise(merchandise);
	}

}
