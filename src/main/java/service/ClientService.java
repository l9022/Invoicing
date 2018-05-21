package service;

import java.util.List;

import dao.IClientDao;
import domain.Client;

public class ClientService implements IClientService{
    private IClientDao clientDao;

	public IClientDao getClientDao() {
		return clientDao;
	}
	public void setClientDao(IClientDao clientDao) {
		this.clientDao = clientDao;
	}

	@Override
	public List<Client> findClient(Client client) {
		return clientDao.findClient(client);
	}
    
	@Override
	public void saveClient(Client client) {
		clientDao.saveClient(client);
	}

	@Override
	public List<Client> findClientByCode(Client client) {
		return clientDao.findClientByCode(client);
	}

	@Override
	public void updateClient(Client client) {
		this.clientDao.updateClient(client);
		
	}
	@Override
	public void delClient(int client) {
		clientDao.delClient(client);
	}
}
