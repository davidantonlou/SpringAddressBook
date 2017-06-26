package com.example.addressbook.service;

import com.example.addressbook.controller.AddressBookController;
import com.example.addressbook.model.Person;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by davidanton on 19/6/17.
 */
public class AddressBookServiceImpl implements AddressBookService {

    @Autowired
    AddressBookController addressBookController;

    @Override
    public List<Person> getAllPersons() {
        return addressBookController.getPersons();
    }

    @Override
    public void addPerson(Person person) {

    }
}
