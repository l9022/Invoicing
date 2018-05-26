package dao;

import java.util.List;

import domain.Stockorder;

public interface IStockorderDao {
	public List<Stockorder> findStockorder(Stockorder stockorder);
	
	public void saveStockorder(Stockorder stockorder);
	
	public List<Stockorder> findStockorderByCode(Stockorder stockorder);
	
	public void updateStockorder(Stockorder stockorder);
	
	public void delStockorder(int stockorder);
}
