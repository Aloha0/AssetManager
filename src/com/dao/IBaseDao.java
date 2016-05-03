package com.dao;


import java.io.Serializable;
import java.util.List;

import com.model.Section;
import com.model.User;

public interface IBaseDao {	
	public Object create(Object obj);
	
	public Object update(Object obj);
	
	public boolean delete(Object obj);
	
	public <T> T get(Class<T> entry,Serializable id);

}
