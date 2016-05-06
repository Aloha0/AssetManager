package com.dao.impl;

import java.util.List;
import com.dao.IAssetDao;
import com.dao.IAssetReturnDao;
import com.model.Asset;
import com.model.AssetReturn;
import com.model.User;

public class AssetReturnDao extends BaseDao implements IAssetReturnDao{
	
	@Override
	public List<AssetReturn> findAll() {
		try {
			return getHibernateTemplate().find("from AssetReturn order by id desc");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public AssetReturn remove(int assetreturnID) {
		AssetReturn assetreturn = get(AssetReturn.class, assetreturnID);
		assetreturn.setStatus(-1);
		
		return (AssetReturn) update(assetreturn);
	}

}
