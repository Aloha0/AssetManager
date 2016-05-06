package com.service.impl;

import java.util.List;

import com.dao.impl.AssetReturnDao;
import com.model.Asset;
import com.model.AssetReturn;
import com.model.User;
import com.service.IAssetReturnService;

public class AssetReturnService implements IAssetReturnService {
	AssetReturnDao assetreturnDao;
	
	@Override
	public AssetReturn get(int id) {
		
		return assetreturnDao.get(AssetReturn.class, id);
	}

	/**
	 * 创建资产 0成功 1失败
	 */
	@Override
	public int create(AssetReturn assetreturn) {
		if(assetreturnDao.create(assetreturn)==null)
			return 1;
		return 0;
	}

	/**
	 * 修改资产信息 0成功 1失败
	 */
	@Override
	public int update(AssetReturn assetreturn) {
		if(assetreturnDao.update(assetreturn)==null)
			return 1;
		return 0;
	}

	/**
	 * 删除资产 状态置为-1  0成功 1失败
	 */
	@Override
	public int delete(int assetreturnID) {
		if(assetreturnDao.remove(assetreturnID)==null)
			return 1;
		return 0;
	}

	@Override
	public List<AssetReturn> findAll() {
		return assetreturnDao.findAll();
	}

	public AssetReturnDao getAssetreturnDao() {
		return assetreturnDao;
	}

	public void setAssetreturnDao(AssetReturnDao assetreturnDao) {
		this.assetreturnDao = assetreturnDao;
	}

	

}
