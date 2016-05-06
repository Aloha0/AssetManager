package com.dao;

import java.util.List;

import com.model.Asset;
import com.model.Setting;
import com.model.User;

public interface IAssetDao {
	public List<Asset> findAll();

	public List<Asset> findAssetLikeName(String name);
	
	public Asset remove(int assetID);

}
