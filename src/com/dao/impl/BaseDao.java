package com.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dao.IBaseDao;

public class BaseDao extends HibernateDaoSupport implements IBaseDao {

	public int save(Object x) {
		try {
			getHibernateTemplate().save(x);
			return 0;
		} catch (Exception e) {
			e.printStackTrace();
			return 1;
			
		}
	}
	
	public int modify(Object x) {
		try {
			getHibernateTemplate().update(x);
			return 0;
		} catch (Exception e) {
			e.printStackTrace();
			return 1;
			
		}
	}
	
	
	public int delete(Object x) {
		try {
			getHibernateTemplate().delete(x);
			return 0;
		} catch (Exception e) {
			e.printStackTrace();
			return 1;
			
		}
	}
}
