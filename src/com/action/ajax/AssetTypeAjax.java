package com.action.ajax;

import java.util.List;

import com.model.AssetType;
import com.service.impl.AssetTypeService;

public class AssetTypeAjax extends BaseAjax {
	public AssetTypeService typeService;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}
	
	public String list(){
		data = initMap();
		List<AssetType> list=typeService.findAll();
		for (AssetType assetType : list) {
			assetType.setPretype(null);
			assetType.setSontypes(null);
		}
		data.put("status", 0);
		data.put("data", list);
		return SUCCESS;
	}
	
	public void setTypeService(AssetTypeService typeService) {
		this.typeService = typeService;
	}
}
