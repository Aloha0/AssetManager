package com.service;

import java.util.List;

import com.dao.impl.SectionDao;
import com.model.Section;
import com.model.User;

public interface IUserService {
	
	public User get(int id);
	
	public User getByName(String name);
	
	public int create(User user);
	
	public int update(User user);
	
	public int delete(int userID);

	public List<User> findAll();

	public List<User> getLikeName(String name);
}
