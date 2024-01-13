package com.Projectapp.services;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Projectapp.entities.User;
import com.Projectapp.exception.UserExceptionNotFound;
import com.Projectapp.repository.UserRepository;

@Service
public class UserServicesImpl implements UserServices {
	
	@Autowired
	private UserRepository userrepo;

	@Override
	public List<User> getalldata() {
		return userrepo.findAll();
	}

	@Override
	public void savedata(User user) {
		userrepo.save(user);
	}

//	@Override
//	public User getdatabyid(Long id) {
//		return userrepo.findById(id).get();
//	}
	
	@Override
	public User getdatabyid(Long id) {
	    try {
	        return userrepo.findById(id).get();
	    } catch (NoSuchElementException e) {
	        throw new UserExceptionNotFound(id);
	    }
	}

	@Override
	public void deletebyid(Long id) {
		userrepo.deleteById(id);
	}

	@Override
	public User updatedatabyid(Long id, User user) {
		return userrepo.findById(id).get();
		
	}

}
