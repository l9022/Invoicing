package dao;

import java.util.List;

import domain.Client;

public interface IClientDao {
    public List<Client> findClient(Client client);
    
    public void saveClient(Client client);
	
	public List<Client> findClientByCode(Client client);
	
	public void updateClient(Client client);
	
	public void delClient(int client);
}
