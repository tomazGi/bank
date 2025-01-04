package pl.tmazewski.bank.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "client")
@Data
public class Client {
    String name;
    String surname;
    String adress;
    Date dateOfBirth;
    @Id
    String email;
    String pesel;

}
