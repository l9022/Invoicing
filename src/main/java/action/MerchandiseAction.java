package action;

import java.util.List;

import domain.Merchandise;
import service.IMerchandiseService;

public class MerchandiseAction {
    private Merchandise merchandise;
    private IMerchandiseService merchandiseService;
    private List<Merchandise> merchandises;
    private String finish_Url;
    private String[] merchandiseId;
    
	public IMerchandiseService getMerchandiseService() {
		return merchandiseService;
	}
	public void setMerchandiseService(IMerchandiseService merchandiseService) {
		this.merchandiseService = merchandiseService;
	}
	public String[] getMerchandiseId() {
		return merchandiseId;
	}
	public void setMerchandiseId(String[] merchandiseId) {
		this.merchandiseId = merchandiseId;
	}
	public String getFinish_Url() {
		return finish_Url;
	}
	public void setFinish_Url(String finish_Url) {
		this.finish_Url = finish_Url;
	}
	public Merchandise getMerchandise() {
		return merchandise;
	}
	public void setMerchandise(Merchandise merchandise) {
		this.merchandise = merchandise;
	}
	public List<Merchandise> getMerchandises() {
		return merchandises;
	}
	public void setMerchandises(List<Merchandise> merchandises) {
		this.merchandises = merchandises;
	}
    
	public String findMerchandise() {
		merchandises = merchandiseService.findMerchandise(merchandise);
		return "findMerchandise";
	}
	
	public String saveMerchandise() {
		merchandiseService.saveMerchandise(merchandise);
		finish_Url = "merchandiseAction_findMerchandise.action";
		return "finish";
	}
	
	public String findMerchandiseByCode() {
		merchandise = merchandiseService.findMerchandiseByCode(merchandise).get(0);
		return "findMerchandiseByCode";
	}
	
	public String updateMerchandise() {
		merchandiseService.updateMerchandise(merchandise);
		finish_Url = "merchandiseAction_findMerchandise.action";
		return "finish";
	}
	
	public String delMerchandise() {
		if(null != merchandiseId) {
			for(String m : merchandiseId) {
				System.out.println(merchandiseId);
				this.merchandiseService.delMerchandise(Integer.parseInt(m));;
				System.out.println(m);
			}
		}
		finish_Url = "merchandiseAction_findMerchandise.action";
		return "finish";
	}
	
}
