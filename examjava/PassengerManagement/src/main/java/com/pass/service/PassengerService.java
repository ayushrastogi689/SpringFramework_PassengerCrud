package com.pass.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pass.dao.PassengerDao;
import com.pass.model.Passenger;

@Component
public class PassengerService {
	@Autowired
	private PassengerDao pDao;

	public void save(Passenger p) {
		pDao.save(p);
	}

	public List<Passenger> fetchAll() {
		return pDao.fetchAll();
	}

	public void remove(int id) {
		pDao.delete(id);
	}

	public void update(int id, Passenger p) {
		pDao.update(id, p);
	}

}
