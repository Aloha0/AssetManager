package com.service.impl;

import java.util.List;

import com.dao.impl.AssetTypeDao;
import com.model.AssetType;
import com.model.Section;
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
	
	@Override
	public int create(AssetType assettype) {
		try {
			assetTypeDao.create( assettype);
			return 0;
		} catch (Exception e) {
			e.printStackTrace();
			return 1;
		}
	}

	@Override
	public int update(AssetType assettype) {
		try {
			if(get(assettype.getId())== null)
				return 2;
			assetTypeDao.update(assettype);
			return 0;
		} catch (Exception e) {
			e.printStackTrace();
			return 1;
		}		
	}
	
	@Override
	public AssetType get(int id) {
		try {
			return assetTypeDao.get(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int delete(int assettypeID) {
		try {
			AssetType assettype = new AssetType();
			assettype.setId(assettypeID);
			if(assettype.getId()<=0 || get(assettypeID)==null)
				return 1;
			
			assetTypeDao.delete(assettype);
			return 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 2;
	}
}
