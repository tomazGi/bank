package pl.tmazewski.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.tmazewski.bank.model.Client;
import pl.tmazewski.bank.model.UserWeb;

public interface UserWebRepository extends JpaRepository<UserWeb, Integer> {
}
