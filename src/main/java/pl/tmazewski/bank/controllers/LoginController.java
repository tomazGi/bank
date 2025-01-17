package pl.tmazewski.bank.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.tmazewski.bank.model.Client;
import pl.tmazewski.bank.model.UserWeb;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.tmazewski.bank.repository.ClientRepository;
import pl.tmazewski.bank.repository.UserWebRepository;

@Controller
public class LoginController {

    @Autowired
    UserWebRepository userWebRepository;


    @GetMapping("/login")
    public String loginForm(Model model) {
        model.addAttribute("userWeb", new UserWeb());
        return "login";
    }

    @PostMapping("/login")
    public String loginSubmit(@ModelAttribute UserWeb userWeb, Model model) {
        model.addAttribute("userWeb", userWeb);
//        Client client = clientRepository.findByEmail(userWeb.getEmail()).getFirst();
      return "account";

    }
}
