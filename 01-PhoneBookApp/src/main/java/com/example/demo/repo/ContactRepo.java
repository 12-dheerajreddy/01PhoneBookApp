package com.example.demo.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Contact;

public interface ContactRepo extends JpaRepository<Contact, Serializable>{

}
