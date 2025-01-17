package pl.tmazewski.bank.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.tmazewski.bank.model.Client;
import pl.tmazewski.bank.model.UserWeb;
import pl.tmazewski.bank.repository.ClientRepository;

@Controller
public class RegistrationController {

    @Autowired
    ClientRepository clientRepository;

    @GetMapping("/registration")
    public String registrationForm(Model model) {
        model.addAttribute("client", new Client());
        return "registration";
    }

    @PostMapping("/registration")
    public String registrationSubmit(@ModelAttribute Client client, Model model) {
        model.addAttribute("client", client);
        clientRepository.save(client);
        return "account";
    }

}
