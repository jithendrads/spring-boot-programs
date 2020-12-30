package com.jithendra.springboothibernate.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jithendra.springboothibernate.dao.PersonDao;
import com.jithendra.springboothibernate.model.Person;

@RestController
@RequestMapping("/hibernate")
public class PersonController {
	
	private PersonDao dao;
	
	@PostMapping("/saveperson")
	public String save(@RequestBody Person person)
	{
	dao.savePerson(person);
	return "success";
	}
    
	@GetMapping("/getperson")
	public List<Person> getAllPerson()
	{
		return dao.getPersons();
		
	}
}
