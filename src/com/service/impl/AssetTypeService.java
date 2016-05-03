package com.service.impl;

import java.util.List;

import com.dao.impl.AssetTypeDao;
import com.model.AssetType;
import com.service.IAssetService;
import com.service.IAssetTypeService;

public class AssetTypeService implements IAssetTypeService{
	AssetTypeDao assetTypeDao;
	@Override
	public List<AssetType> findAll() {


		return assetTypeDao.findAll();
	}
	
	public AssetTypeDao getAssetTypeDao() {
		return assetTypeDao;
	}
	
	
	public void setAssetTypeDao(AssetTypeDao assetTypeDao) {
		this.assetTypeDao = assetTypeDao;
	}

}
