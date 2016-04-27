package com.dao;

import java.util.List;

import com.model.Assettype;

public interface IAssetTypeDao {
	public void create(Assettype assettype);
	
	public void update(Assettype assettype);
	
	public void remove(Assettype assettype);
	
	public List<Assettype> findAssetType(String assettypeID);

}
