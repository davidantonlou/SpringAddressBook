package com.example.addressbook.controller;

import com.example.addressbook.model.Person;
import com.example.addressbook.repository.PersonRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Created by davidanton on 8/6/17.
 */
@Controller
public class AddressBookController {

    private final PersonRepository personRepository;

    AddressBookController(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    @GetMapping("/persons")
    public List<Person> getPersons() {
        return personRepository.findAll();
    }

    @GetMapping("/persons/{id}")
    public ResponseEntity getPerson(@PathVariable("id") Long id) {

        Optional<Person> person = personRepository.getById(id);
        if (!person.isPresent()) {
            return new ResponseEntity("No Person found for ID " + id, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity(person, HttpStatus.OK);
    }

    @PostMapping(value = "/persons")
    public ResponseEntity createPerson(@RequestBody Person person) {

        personRepository.save(person);

        return new ResponseEntity(person, HttpStatus.OK);
    }

    @DeleteMapping("/persons")
    public ResponseEntity deletePerson(@RequestBody Person person) {

        personRepository.delete(person);

        return new ResponseEntity(person, HttpStatus.OK);

    }

    @PutMapping("/persons/{id}")
    public ResponseEntity updatePerson(@PathVariable Long id, @RequestBody Person person) {

        person = personRepository.update(person);

        if (null == person) {
            return new ResponseEntity("No Person found for ID " + id, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity(person, HttpStatus.OK);
    }
}
