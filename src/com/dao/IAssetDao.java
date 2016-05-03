package com.dao;

import java.util.List;

import com.model.Asset;
import com.model.Setting;

public interface IAssetDao {
	public List<Asset> findAll();
	
	public Asset remove(int assetID);

}
