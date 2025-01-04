package pl.tmazewski.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.tmazewski.bank.model.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
