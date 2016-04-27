package com.action;

import com.model.AssetType;
import com.opensymphony.xwork2.ActionSupport;
import com.service.impl.AssetTypeService;

public class AssetTypeAction extends BaseAction {
	private AssetTypeService assettypeService;
	private AssetType assettype;
	
	@Override
	public String execute() throws Exception {
		System.out.println("assettype action========");
		
		
		return "none";
	}
	
	public String create() throws Exception{
		System.out.println("create AssetType "+assettype.getName());
		int res = assettypeService.create(assettype);
		if(res==0)
			return "createSuccess";
		return "createFail";
	}
	

	public AssetTypeService getAssettypeService() {
		return assettypeService;
	}

	public void setAssettypeService(AssetTypeService assettypeService) {
		this.assettypeService = assettypeService;
	}

	public AssetType getAssettype() {
		return assettype;
	}

	public void setAssettype(AssetType assettype) {
		this.assettype = assettype;
	}

}