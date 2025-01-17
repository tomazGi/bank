package pl.tmazewski.bank.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.tmazewski.bank.model.Client;
import pl.tmazewski.bank.model.UserWeb;
import pl.tmazewski.bank.repository.ClientRepository;
import pl.tmazewski.bank.repository.UserWebRepository;

@Controller
public class AccountController {

    @Autowired
    UserWebRepository userWebRepository;

    @Autowired
    ClientRepository clientRepository;

    @GetMapping("/account")
    public String account(Model model) {
        model.addAttribute("client", new Client());
        return "account";
    }
}
