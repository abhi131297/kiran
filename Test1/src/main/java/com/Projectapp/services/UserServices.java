package com.Projectapp.services;

import java.util.List;


import com.Projectapp.entities.User;

public interface UserServices {

	List<User> getalldata();

	void savedata(User user);

	User getdatabyid(Long id);

	void deletebyid(Long id);

	User updatedatabyid(Long id, User user);

}
