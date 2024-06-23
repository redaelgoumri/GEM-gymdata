package ma.xproce.gem.services;

import ma.xproce.gem.dao.entities.Client;

import java.util.List;

public interface ClientManager {
    Client addClient(Client client);
    Client updateClient(Client client);
    boolean deleteClient(Integer id);
    List<Client> getAllClients();
    Client getClientById(Integer id);
}
