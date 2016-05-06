package com.dao;


import java.util.List;

import com.model.Section;
import com.model.User;

public interface IUserDao {
	public User get(int id);
	
	public User findUserByName(String name);
	
	public List<User> findAllUser();

	public List<User> findUserLikeName(String name);
}
