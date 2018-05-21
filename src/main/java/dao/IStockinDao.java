package dao;

import java.util.List;

import domain.Stockin;

public interface IStockinDao {
	public List<Stockin> findStockin(Stockin stockin);
	
	public void saveStockin(Stockin stockin);
}
