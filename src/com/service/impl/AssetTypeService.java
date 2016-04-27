package com.service.impl;

import java.util.List;

import com.dao.impl.AssetTypeDao;
import com.model.AssetType;
import com.service.IAssetTypeService;

public class AssetTypeService implements IAssetTypeService {
	private AssetTypeDao assettypeDao;
	@Override
	public int create(AssetType assettype) {
		// TODO Auto-generated method stub
		try{
			assettypeDao.create(assettype);
			return 0;
		} catch (Exception e){
			e.printStackTrace();
			return 1;
		}

	}

	@Override
	public int update(AssetType assettype) {
		// TODO Auto-generated method stub
		try{
			assettypeDao.update(assettype);
			return 0;
		} catch(Exception e){
			e.printStackTrace();
			return 1;
		}
	}

	@Override
	public int remove(String assettypeID) {
		// TODO Auto-generated method stub
		try{
			AssetType assettype = new AssetType();
			assettype.setId(Integer.parseInt(assettypeID));
			if(assettype.getId()<=0)
				return 1;
			assettypeDao.remove(assettype);
			return 0;
			
		} catch(Exception e){
			e.printStackTrace();
		}
		return 2;
	}

	@Override
	public List<AssetType> findAssetType(String assettypeID) {
		// TODO Auto-generated method stub
		try{
			return assettypeDao.findAssetType(assettypeID);
		} catch(Exception e){
			e.printStackTrace();
			return null;
		}
		
	}

	public AssetTypeDao getAssettypeDao() {
		return assettypeDao;
	}

	public void setAssettypeDao(AssetTypeDao assettypeDao) {
		this.assettypeDao = assettypeDao;
	}

}
