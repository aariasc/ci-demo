package demoapp.dao;

import java.util.List;

import org.hibernate.Session;

import demoapp.model.Person;

public class PersonDAO {

	public List<Person> getAll(){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	    session.beginTransaction();
	    List<Person> result = session.createCriteria(Person.class).list();
	    session.getTransaction().commit();
	    return result;
		
	}
	
}
