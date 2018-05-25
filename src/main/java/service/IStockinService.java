package service;

import java.util.List;

import domain.Stockin;

public interface IStockinService {
	public List<Stockin> findStockin(Stockin stockin);
	
	public void saveStockin(Stockin stockin);
	
	public List<Stockin> findStockinByCode(Stockin stockin);
	
	public void updateStockin(Stockin stockin);
	
	public void delStockin(int stockin);
}
