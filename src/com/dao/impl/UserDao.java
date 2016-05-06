package com.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dao.ISectionDao;
import com.dao.IUserDao;
import com.model.Section;
import com.model.User;

public class UserDao extends BaseDao implements IUserDao{

	@Override
	public User get(int id) {
		try {
			return super.getHibernateTemplate().get(User.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<User> findUserLikeName(String name) {
		//name = "%"+name+"%";
		String hql = "from User where name like '%"+name+"%'";
		System.out.println(hql);

		try {
			Query query = getSession().createQuery(hql);
			//		.setString(0, name);
			
			List list = query.list();
			if(list == null || list.size()==0)
				return null;
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public User findUserByName(String name) {
		//name = "%"+name+"%";
		String hql = "from User where name='"+name+"'";
		System.out.println(hql);

		try {
			Query query = getSession().createQuery(hql);
			//		.setString(0, name);
			
			List list = query.list();
			if(list == null || list.size()==0)
				return null;
			return (User)list.get(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<User> findAllUser() {
		String hql = "from User where status!=-1 order by id desc";
		try {
			return getHibernateTemplate().find(hql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}


}
