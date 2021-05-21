package com.example.client.manager.repository;

import com.example.client.manager.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client, Long> {
    void deleteClientById(Long id);

    Optional <Client>findClientById(Long id);
}
