package dao;

import java.util.List;

import domain.Merchandise;

public interface IMerchandiseDao {
	public List<Merchandise> findMerchandise(Merchandise merchandise);
	
	public void saveMerchandise(Merchandise merchandise);
	
	public List<Merchandise> findMerchandiseByCode(Merchandise merchandise);
	
	public void updateMerchandise(Merchandise merchandise);
	
	public void delMerchandise(int merchandise);
}
