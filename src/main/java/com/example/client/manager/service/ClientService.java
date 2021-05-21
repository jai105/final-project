package com.example.client.manager.service;

import com.example.client.manager.exception.UserNotFoundException;
import com.example.client.manager.model.Client;
import com.example.client.manager.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class ClientService {
    private final ClientRepository clientRepository;

@Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }
    public Client addClient(Client client) {
    client.setClientCode(UUID.randomUUID().toString());
        return clientRepository.save(client);
    }
    public List<Client> findAllClients() {
    return clientRepository.findAll();
    }
    public Client updateClient(Client client){
    return clientRepository.save(client);
    }
    public Client findClientById(Long id){
    return clientRepository.findClientById(id)
            .orElseThrow(()->new UserNotFoundException("User by id"+ id +"was not found"));
    }
    public void deleteClient(Long id){
    clientRepository.deleteClientById(id);
    }
}
