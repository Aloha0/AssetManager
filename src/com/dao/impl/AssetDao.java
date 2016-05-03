package com.dao.impl;

import java.util.List;

import com.dao.IAssetDao;
import com.model.Asset;

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
	public Asset remove(int assetID) {
		Asset asset = get(Asset.class, assetID);
		asset.setStatus(-1);
		
		return (Asset) update(asset);
	}

}
