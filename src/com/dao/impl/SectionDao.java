package com.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dao.ISectionDao;
import com.model.Section;
import com.model.User;

public class SectionDao extends BaseDao implements ISectionDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findSectionUsers(final String sectionID) {
		return (List<User>) super.getHibernateTemplate().execute(
				new HibernateCallback<Object>() {
					@Override
					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						List<User> list = new ArrayList<User>();
						try {
							Criteria criteria = session.createCriteria(User.class);
							list = (List<User>)criteria.add(Restrictions.eq("section", sectionID)).list();
							return list;
						} catch (Exception e) {
							e.printStackTrace();
						}
						
						return list;
					}		
				});

	}
	
	@Override
	public List<Section> findSections() {
		try {
			return (List<Section>)super.getHibernateTemplate().find("from Section order by id desc");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<Section>();
	}

	@Override
	public Section get(int id) {
		
		return super.getHibernateTemplate().get(Section.class, id);
	}



}
