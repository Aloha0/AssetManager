package com.dao.impl;

import com.model.Userimfo;

public class UserDao extends BaseDao{

	public int remove(Userimfo user) {
		user.setUistate(-1);
		return modify(user);
		
	}
}
