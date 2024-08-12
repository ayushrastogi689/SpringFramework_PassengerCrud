package com.pass.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pass.model.Passenger;

@Component
public class PassengerDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public void save(Passenger p) {
	
	try {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(p);
		session.getTransaction().commit();
	}
	catch(Exception ex) {
		ex.printStackTrace();
	}
	
}
	
	public List<Passenger>fetchAll(){
	
		try {
		Session session=sessionFactory.openSession();
	 return session.createQuery("FROM Passenger").getResultList();
	
	}
	catch(Exception ex) {
		ex.printStackTrace();
	}
	return null;
}
	

	public void delete(int id) {
	try {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		Passenger p=session.find(Passenger.class, id);
		if(p!=null) {
			session.remove(p);
		
	}
		session.getTransaction().commit();
	}
	catch(Exception ex) {
		ex.printStackTrace();
	}

}

	public void update(int id,Passenger p) {
	
		try {
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		Passenger pass=session.find(Passenger.class, id);
		if(p!=null) {
			pass.setName(p.getName());
			pass.setCountry(p.getCountry());
			pass.setGender(p.getGender());
			pass.setMailinglist(p.getMailinglist());
			pass.setName(p.getName());
			pass.setAboutyou(p.getAboutyou());
			session.update(pass);
		}
		session.getTransaction().commit();
	}
	catch(Exception ex) {
		ex.printStackTrace();
	}
	

}
}
