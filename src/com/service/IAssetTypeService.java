package com.service;

import java.util.List;
import com.model.AssetType;

public interface IAssetTypeService {
	
	public int create(AssetType assettype);
	
	public int update(AssetType assettype);
	
	public int remove(String assettypeID);
	
	public List<AssetType> findAssetType(String assettypeID);

}