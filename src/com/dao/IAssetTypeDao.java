package com.dao;

import java.util.List;

import com.model.AssetType;

public interface IAssetTypeDao {
	public void create(AssetType assettype);
	
	public void update(AssetType assettype);
	
	public void remove(AssetType assettype);
	
	public List<AssetType> findAssetType(String assettypeID);

}
