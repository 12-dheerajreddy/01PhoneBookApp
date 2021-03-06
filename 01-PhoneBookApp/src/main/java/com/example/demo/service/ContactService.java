package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Contact;

public interface ContactService {
	
	public String saveContact(Contact contact);
	public List<Contact> getAllContacts();
	public Contact getContactById(Integer ContactId);
	public boolean deleteContact(Integer contactId);
	public boolean updateContact(Contact contact);

}
