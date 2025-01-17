package pl.tmazewski.bank.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankomatController {



    @GetMapping({"/bankomat"})
    public String bankomat() {
        return "bankomat";
    }
}
