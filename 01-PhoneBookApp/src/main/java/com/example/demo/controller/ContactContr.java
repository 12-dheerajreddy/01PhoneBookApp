package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Contact;
import com.example.demo.service.ContactServImpl;

@Controller
public class ContactContr {
    @Autowired
	public ContactServImpl contactserv;
	
	@GetMapping("/loadform")
	public String loadForm(Model m) {
		m.addAttribute("contact", new Contact());
		return "index";
	}
	
	@PostMapping("/addContact")
	public String SaveContact(Contact contact,Model m) {
		contactserv.saveContact(contact);
		m.addAttribute("succ", "content saved sucessfully");
		
		return "redirect:/loadform";
	}
	
	@GetMapping("/viewContact")
	public String viewAllContats(Model m) {
		List<Contact> allContacts = contactserv.getAllContacts();
		m.addAttribute("contact", allContacts);
		return "viewContacts";
	}
	
	@GetMapping("/edit")
	public String handleEditClick(@RequestParam("cid") int cid,Model m) {
		Contact contactById = contactserv.getContactById(cid);
		m.addAttribute("contact", contactById);
		return "index";
	}
	
	@GetMapping("/delete")
	public String handleDeletClick(@RequestParam("cid") int cid) {
		contactserv.deleteContact(cid);
		return "redirect:/viewContact";
	}
	
}
