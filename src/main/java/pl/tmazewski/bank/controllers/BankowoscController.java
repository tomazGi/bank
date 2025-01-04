package pl.tmazewski.bank.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.tmazewski.bank.model.Client;
import pl.tmazewski.bank.repository.ClientRepository;

@RestController
public class BankowoscController {

    @Autowired
    MainController mainController;

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping(path = "/client")
    public ResponseEntity<?> createEmployee() {
        Client client = new Client();
        client.setPesel("33423423");
        client.setName("Roman");
        client.setAdress("dfas");
        client.setSurname("Paweł");
        client.setAdress("dfas");
        client.setEmail("dsafsdf");
        clientRepository.save(client);
        return ResponseEntity.ok(client);
    }



    @GetMapping({"/online"})
    public String bankowosc() {
        return "Greetings from Spring Boot!</br>".concat("<a href='/online'>Bankowość online.</a>\n").concat("<a href='/bankomat'>Obsługa bankomatów</a>");
    }

}

