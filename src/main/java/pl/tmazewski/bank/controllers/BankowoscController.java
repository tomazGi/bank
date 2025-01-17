package pl.tmazewski.bank.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.tmazewski.bank.model.Client;
import pl.tmazewski.bank.repository.ClientRepository;

@Controller
public class BankowoscController {

    @Autowired
    MainController mainController;

    @Autowired
    private ClientRepository clientRepository;



    @GetMapping({"/online"})
    public String bankowosc() {
        return "bankowosc";
    }

}

