package pl.tmazewski.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.tmazewski.bank.model.Client;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Integer> {
    List<Client> findByEmail(String email);
}
