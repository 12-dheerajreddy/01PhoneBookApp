package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Contact;
import com.example.demo.repo.ContactRepo;

@Service()
public class ContactServImpl implements ContactService {
    
	@Autowired
	private ContactRepo contactRepo;
	String s;
	@Override
	public String saveContact(Contact contact) {
		Contact save = contactRepo.save(contact);
		if(save!=null) {
			s="sucess";
		return s;
		}
		else {
			s="failure";
			return s;
		}
	}

	@Override
	public List<Contact> getAllContacts() {
		List<Contact> findAll = contactRepo.findAll();
		return findAll;
	}

	@Override
	public Contact getContactById(Integer ContactId) {
	   Optional<Contact> findById = contactRepo.findById(ContactId);
	   if(findById.isPresent()) {
		 Contact save = contactRepo.save(findById.get());
		 return save;
	}
	   return null;
	}

	@Override
	public boolean deleteContact(Integer contactId) {
	//	Contact c=contactRepo.deleteById(contactId);
		try {
			 contactRepo.deleteById(contactId);
		return true;
		}
		catch (Exception e){
		e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean updateContact(Contact contact) {
		try {
			contactRepo.save(contact);
			return true;
			}
			catch (Exception e){
			e.printStackTrace();
				return false;
			}
	}

}
