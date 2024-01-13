package com.Projectapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Projectapp.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
