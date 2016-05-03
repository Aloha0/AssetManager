package com.service;

import java.util.List;

import com.model.Asset;
import com.model.Setting;

public interface IAssetService {
	public Asset get(int id);
		
	public int create(Asset asset);
	
	public int update(Asset asset);
	
	public int delete(int assetID);

	public List<Asset> findAll();
	
}
