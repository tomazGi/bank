package pl.tmazewski.bank.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class BankomatController {

    @GetMapping({"/online"})
    public String bankowosc() {
        return "Greetings from Spring Boot!</br>".concat("<a href='/online'>Bankowość online.</a>\n").concat("<a href='/bankomat'>Obsługa bankomatów</a>");
    }

    @GetMapping({"/bankomat"})
    public String bankomat() {
        return "Greetings from Spring Boot!<\\br>".concat("<a href='/online'>Strona online.</a>\n").concat("<a href='/bankomat'>Obsługa bankomatów</a>");
    }
}
