package service;

import java.util.List;

import dao.StockorderDao;
import domain.Stockorder;

public class StockorderService implements IStockorderService{
    private StockorderDao stockorderDao;
	
	public StockorderDao getStockorderDao() {
		return stockorderDao;
	}
	public void setStockorderDao(StockorderDao stockorderDao) {
		this.stockorderDao = stockorderDao;
	}

	@Override
	public List<Stockorder> findStockorder(Stockorder stockorder) {
		return stockorderDao.findStockorder(stockorder);
	}
	@Override
	public void saveStockorder(Stockorder stockorder) {
		stockorderDao.saveStockorder(stockorder);
	}
	@Override
	public List<Stockorder> findStockorderByCode(Stockorder stockorder) {
		return stockorderDao.findStockorderByCode(stockorder);
	}
	@Override
	public void updateStockorder(Stockorder stockorder) {
		stockorderDao.updateStockorder(stockorder);
	}
	@Override
	public void delStockorder(int stockorder) {
		stockorderDao.delStockorder(stockorder);
	}

}
