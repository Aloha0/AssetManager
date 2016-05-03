package com.dao.impl;

import java.util.List;

import com.dao.IAssetDao;
import com.dao.IAssetTypeDao;
import com.model.Asset;
import com.model.AssetType;

public class AssetTypeDao extends BaseDao implements IAssetTypeDao{

	@Override
	public List<AssetType> findAll() {
		try {
			return getHibernateTemplate().find("from AssetType order by id");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}




}
