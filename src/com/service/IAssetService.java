package com.service;

import java.util.List;

import com.model.Asset;

public interface IAssetService {
	public Asset get(int id);
		
	public int create(Asset asset);
	
	public int update(Asset asset);
	
	public int delete(int assetID);

	public List<Asset> getLikeName(String name);
		
	public List<Asset> findAll();
	
}
