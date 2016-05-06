package com.dao;

import java.util.List;
import com.model.Asset;
import com.model.AssetReturn;
import com.model.User;


public interface IAssetReturnDao {

	public List<AssetReturn> findAll();
	
	public AssetReturn remove(int assetreturnID);
}
