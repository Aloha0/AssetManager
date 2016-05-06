package com.service.impl;

import java.util.List;

import com.dao.impl.AssetDao;
import com.model.Asset;
import com.model.User;
import com.service.IAssetService;

public class AssetService implements IAssetService {
	AssetDao assetDao;
	
	@Override
	public Asset get(int id) {
		
		return assetDao.get(Asset.class, id);
	}

	/**
	 * 创建资产 0成功 1失败
	 */
	@Override
	public int create(Asset asset) {
		if(assetDao.create(asset)==null)
			return 1;
		return 0;
	}

	/**
	 * 修改资产信息 0成功 1失败
	 */
	@Override
	public int update(Asset asset) {
		if(assetDao.update(asset)==null)
			return 1;
		return 0;
	}

	/**
	 * 删除资产 状态置为-1  0成功 1失败
	 */
	@Override
	public int delete(int assetID) {
		if(assetDao.remove(assetID)==null)
			return 1;
		return 0;
	}

	@Override
	public List<Asset> getLikeName(String name) {
		return assetDao.findAssetLikeName(name);
	}
	
	@Override
	public List<Asset> findAll() {
		return assetDao.findAll();
	}

	public AssetDao getAssetDao() {
		return assetDao;
	}

	public void setAssetDao(AssetDao assetDao) {
		this.assetDao = assetDao;
	}

}
