package com.dao.impl;

import java.util.List;
import java.util.Set;

import org.hibernate.Query;

import com.dao.ISettingDao;
import com.model.Setting;

public class SettingDao extends BaseDao implements ISettingDao{

	@Override
	public List<Setting> findAll() {
		try {
			return getHibernateTemplate().find("from Setting order by id desc , type asc");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Setting findByName(String setting_name) {
		String hql = "from Setting where name = ?";
		try {
			Query query = getSession().createQuery(hql);
			query.setString(0, setting_name);
			List list = query.list();
			if(list == null || list.size()==0)
				return null;
			return (Setting) list.get(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Setting> findByType(String type) {
		String hql = "from Setting where type = ?";
		try {
			Query query = getSession().createQuery(hql);
			query.setString(0, type);
			return query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
