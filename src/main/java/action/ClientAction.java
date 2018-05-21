package action;

import java.util.List;

import domain.Client;
import service.IClientService;

public class ClientAction {
    private Client client;
    private IClientService clientService;
    private List<Client> clients;
    private String finish_Url;
    private String[] clientId;
    
	public IClientService getClientService() {
		return clientService;
	}
	public void setClientService(IClientService clientService) {
		this.clientService = clientService;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public List<Client> getClients() {
		return clients;
	}
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
	public String getFinish_Url() {
		return finish_Url;
	}
	public void setFinish_Url(String finish_Url) {
		this.finish_Url = finish_Url;
	}
	public String[] getClientId() {
		return clientId;
	}
	public void setClientId(String[] clientId) {
		this.clientId = clientId;
	}
	
	public String findClient() {
		clients = clientService.findClient(client);
		return "findClient";
	}
	
	//向数据库新增数据
	public String saveClient() {
		clientService.saveClient(client);
		finish_Url = "clientAction_findClient.action";
		return "finish";
	}
	
	//通过编号向数据库取得一串数据，输出
	public String findClientByCode(){
		client=clientService.findClientByCode(client).get(0);
		return "findClientByCode";
	}
	
	//通过查询的数据更改后重新写入数据库
	public String updateClient() {
		clientService.updateClient(client);
		finish_Url = "clientAction_findClient.action";
		return "finish";
	}
	
	//删除
	public String delClient(){
		if(null != clientId) {
			for(String s: clientId) {
				System.out.println(clientId);
				this.clientService.delClient(Integer.parseInt(s));;
				System.out.println(s);
			}
		}
		finish_Url = "clientAction_findClient.action";
		return "finish";
	}
}
