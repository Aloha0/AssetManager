package com.dao.impl;

import java.util.List;

import org.hibernate.Query;

import com.dao.IAssetDao;
import com.model.Asset;
import com.model.User;

public class AssetDao extends BaseDao implements IAssetDao{

	@Override
	public List<Asset> findAll() {
		try {
			return getHibernateTemplate().find("from Asset order by id desc");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Asset> findAssetLikeName(String name) {
		//name = "%"+name+"%";
		String hql = "from Asset where name like '%"+name+"%'";
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
	public Asset remove(int assetID) {
		Asset asset = get(Asset.class, assetID);
		asset.setStatus(-1);
		
		return (Asset) update(asset);
	}

}
