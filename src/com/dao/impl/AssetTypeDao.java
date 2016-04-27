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
import com.model.AssetType;
import com.model.User;

public class AssetTypeDao extends HibernateDaoSupport implements IAssetTypeDao {

	@Override
	public void create(AssetType assettype) {
		// TODO Auto-generated method stub
		super.getHibernateTemplate().save(assettype);

	}

	@Override
	public void update(AssetType assettype) {
		// TODO Auto-generated method stub
		super.getHibernateTemplate().saveOrUpdate(assettype);

	}

	@Override
	public void remove(AssetType assettype) {
		// TODO Auto-generated method stub
		super.getHibernateTemplate().delete(assettype);

	}

	@Override
	@SuppressWarnings("unchecked")
	public List<AssetType> findAssetType(final String assettypeID){
		return (List<AssetType>) super.getHibernateTemplate().execute(
				new HibernateCallback<Object>() {
					@Override
					public Object doInHibernate(Session session)
							throws HibernateException, SQLException {
						List<User> list = new ArrayList<User>();
						try {
							Criteria criteria = session.createCriteria(User.class);
							list = (List<User>)criteria.add(Restrictions.eq("user", assettypeID)).list();
							return list;
						} catch (Exception e) {
							e.printStackTrace();
						}
						
						return list;
					}		
				});

	}

}
