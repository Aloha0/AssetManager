package com.service;

import java.util.List;

import com.model.Asset;
import com.model.AssetType;
import com.model.Section;

public interface IAssetTypeService {

	public List<AssetType> findAll();
	public AssetType get(int id);
	
	public int create(AssetType assettype);
	
	public int update(AssetType assettype);
	
	public int delete(int assettypeID);


}
