package pl.tmazewski.bank.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "client")
@Data
public class Client {
    String name;
    String surname;
    String adress;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date dateOfBirth;
    @Id
    String email;
    String pesel;
    String password;

}
