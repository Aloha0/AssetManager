package com.service.impl;

import java.util.List;

import com.dao.impl.SectionDao;
import com.dao.impl.UserDao;
import com.model.Section;
import com.model.User;
import com.service.ISectionService;
import com.service.IUserService;

public class UserService implements IUserService{
	private UserDao userDao;

	@Override
	public User get(int id) {
		
		return userDao.get(id);
	}

	@Override
	public User getByName(String name) {
		return userDao.findUserByName(name);
	}

	
	/**
	 * 创建用户 0成功 1 用户已存在 2用户信息不完整
	 */
	@Override
	public int create(User user) {
		if(user.getName()==null || user.getName().equals(""))
			return 2;
		if(getByName(user.getName())!=null)
			return 1;
		
		if(userDao.create(user) !=null)
			return 0;
	
		return 3;
	}

	/**
	 * 
	 * 修改用户信息
	 * 0 成功 1用户不存在 2修改失败
	 */
	@Override
	public int update(User user) {
		if(userDao.findUserByName(user.getName())==null)
			return 1;
		if(userDao.update(user)==null)
			return 2;
		return 0;
	}

	/**
	 * 
	 * 删除用户
	 * 0 成功 1 保存失败 2用户不存在
	 */
	@Override
	public int delete(int userID) {
		User user = userDao.get(userID);
		if(user == null) return 2;
		user.setStatus(-1);
		if(userDao.update(user)==null)
			return 1;
		return 0;
	}

	@Override
	public List<User> findAll() {

		return userDao.findAllUser();
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
