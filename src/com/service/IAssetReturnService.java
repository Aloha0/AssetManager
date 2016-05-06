package com.service;

import java.util.List;

import com.model.Asset;
import com.model.AssetReturn;
import com.model.User;

public interface IAssetReturnService {
	public AssetReturn get(int id);
		
	public int create(AssetReturn assetreturn);
	
	public int update(AssetReturn assetreturn);
	
	public int delete(int assetreturnID);
	
	public List<AssetReturn> findAll();
}
