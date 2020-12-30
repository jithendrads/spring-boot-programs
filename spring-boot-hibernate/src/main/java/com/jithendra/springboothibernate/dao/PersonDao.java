package com.jithendra.springboothibernate.dao;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jithendra.springboothibernate.model.Person;

@Repository
@Transactional
public class PersonDao {

	@Autowired
	private SessionFactory factory;
	
	private Session getSession()
	{
		Session session =factory.getCurrentSession();
		if(session==null)
			session=factory.openSession();
		return session;
	}
	
	public void savePerson(Person person)
	{
		getSession().save(person);
	}
	
	@SuppressWarnings("deprecation")
	public List<Person> getPersons()
	{
		return getSession().createCriteria(Person.class).list();
	}
}
