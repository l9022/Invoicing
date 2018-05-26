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

}
