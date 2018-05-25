package service;

import java.util.List;

import dao.IStockinDao;
import domain.Stockin;

public class StockinService implements IStockinService{
	private IStockinDao stockinDao;

	public IStockinDao getStockinDao() {
		return stockinDao;
	}
	public void setStockinDao(IStockinDao stockinDao) {
		this.stockinDao = stockinDao;
	}

	@Override
	public List<Stockin> findStockin(Stockin stockin) {
		return stockinDao.findStockin(stockin);
	}
	@Override
	public void saveStockin(Stockin stockin) {
		stockinDao.saveStockin(stockin);
	}
	@Override
	public List<Stockin> findStockinByCode(Stockin stockin) {
		return stockinDao.findStockinByCode(stockin);
	}
	@Override
	public void updateStockin(Stockin stockin) {
		stockinDao.updateStockin(stockin);
	}
	@Override
	public void delStockin(int stockin) {
		stockinDao.delStockin(stockin);
	}
}
