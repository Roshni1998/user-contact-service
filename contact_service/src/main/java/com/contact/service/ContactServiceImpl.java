package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    List<Contact> contactList = List.of(
            new Contact(1L, "roshni@gmail.com", "Roshni", 13311L),
            new Contact(2L, "prince@gmail.com", "Prince", 13312L)
    );

    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return contactList.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
