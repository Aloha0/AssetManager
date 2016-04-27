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

import com.dao.IAssetTypeDao;
import com.model.Assettype;
import com.model.User;

public class AssettypeDao extends HibernateDaoSupport implements IAssetTypeDao {

	@Override
	public void create(Assettype Assettype) {
		// TODO Auto-generated method stub
		super.getHibernateTemplate().save(Assettype);

	}

	@Override
	public void update(Assettype Assettype) {
		// TODO Auto-generated method stub
		super.getHibernateTemplate().saveOrUpdate(Assettype);

	}

	@Override
	public void remove(Assettype Assettype) {
		// TODO Auto-generated method stub
		super.getHibernateTemplate().delete(Assettype);

	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Assettype> findAssetType(final String AssettypeID){
		return (List<Assettype>) super.getHibernateTemplate().execute(
				new HibernateCallback<Object>() {
					@Override
					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						List<User> list = new ArrayList<User>();
						try {
							Criteria criteria = session.createCriteria(User.class);
							list = (List<User>)criteria.add(Restrictions.eq("user", AssettypeID)).list();
							return list;
						} catch (Exception e) {
							e.printStackTrace();
						}
						
						return list;
					}		
				});

	}

}
