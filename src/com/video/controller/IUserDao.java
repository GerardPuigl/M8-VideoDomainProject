package com.video.controller;

import java.util.List;

import javax.security.sasl.AuthenticationException;

import com.video.model.User;

public interface IUserDao {

	public User authenticationUser(String name,String surname,String password) throws AuthenticationException;
	public void addUser(String name, String surname, String password);
	public List<User> getUsers();
}