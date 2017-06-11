package com.example.addressbook.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by davidanton on 8/6/17.
 */
@RestController
public class AddressBookController {
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
