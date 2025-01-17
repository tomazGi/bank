package pl.tmazewski.bank.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "userWeb")
@Data
public class UserWeb {
    private String email;
    @Id
    private long id;
    private String password;
}
