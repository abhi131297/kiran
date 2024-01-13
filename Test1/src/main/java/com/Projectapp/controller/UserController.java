package com.Projectapp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Projectapp.entities.User;
import com.Projectapp.services.UserServices;

@RestController
@RequestMapping("/show")
public class UserController {

	@Autowired
	private UserServices Userser;

	@GetMapping("/getall")
	public List<User> getalldata() {
		return Userser.getalldata();
	}

	@PostMapping("/save")
	public String savedata(@Valid @RequestBody User user) {
		Userser.savedata(user);
		return "record is saved";
	}

	@GetMapping("/getbyid/{id}")
	public User getdatabyid(@PathVariable Long id) {
		return Userser.getdatabyid(id);
	}

	@DeleteMapping("/delete/{id}")
	public String deletebyid(@PathVariable Long id) {
		Userser.deletebyid(id);
		return "data deleted";
	}

//	@GetMapping("/update")
//	public User updatedatabyid(@RequestBody User user, @PathVariable Long id) {
//		return Userser.updatedatabyid(id, user).Map(users -> {
//			users.setUsername(newUser.getUsername());
//			users.setName(newUser.getName());
//			users.setEmail(newUser.getEmail());
//	          return userRepository.save(users);
//	      });
		
	
}
