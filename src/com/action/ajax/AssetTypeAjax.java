package com.action.ajax;

import java.util.List;

import com.model.AssetType;
import com.model.Section;
import com.service.impl.AssetTypeService;
import com.service.impl.SectionService;

public class AssetTypeAjax extends BaseAjax {
	public AssetTypeService typeService=null;
	
	 AssetType assettype;
	String assettype_name = "";
	int assettype_id = 0;
	String assettype_typenum="";
	
	private String[] createResult = {"创建资产类型成功","创建资产类型失败","资产类型信息不完整"};	
	private String[] updateResult = {"修改资产类型成功","修改资产类型失败","资产类型ID错误"};	
	private String[] deleteResult = {"删除资产类型成功","创建资产类型失败","资产类型ID错误"};	

	
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
	
	public String create() {
		System.out.println("insert assettype : "+assettype_name+"--"+assettype_typenum);
		int res = 0;
		if(assettype_name.equals("")||assettype_typenum.equals(""))
			res = 2;
		else{
			AssetType tmp = new AssetType();
			tmp.setName(assettype_name);
			tmp.setTypenum(assettype_typenum);
			res = typeService.create(tmp);
		}
		data = initMap();
		data.put("status", res);
		data.put("msg", createResult[res]);
		assettype_name = "";
		assettype_typenum="";
		return SUCCESS;
	}
	
	public String update() {
		System.out.println("edit : id :"+assettype_id+"  "+assettype_name);
		int res = 0;
		System.out.println(assettype_id + "--"+assettype_name);
		if(assettype_id<=0 || assettype_name.equals(""))
			res = 2;
		else{
			AssetType tmp = new AssetType();
			tmp.setId(assettype_id);
			tmp.setName(assettype_name);
			tmp.setTypenum(assettype_typenum);
			res = typeService.update(tmp);
		}
		data = initMap();
		data.put("status", res);
		data.put("msg", updateResult[res]);
		assettype_id = -1;
		assettype_name = "";
		return SUCCESS;
	}
	
	public String remove() {
		int res = 0;
		if(assettype_id <= 0 )
			res = 2;
		else{
			res = typeService.delete(assettype_id);
		}
		data = initMap();
		data.put("status", res);
		data.put("msg", deleteResult[res]);
		assettype_id = -1;

		return SUCCESS;
	}
	
	public void setTypeService(AssetTypeService typeService) {
		this.typeService = typeService;
	}

	public AssetType getAssettype() {
		return assettype;
	}

	public void setAssettype(AssetType assettype) {
		this.assettype = assettype;
	}

	public String getAssettype_name() {
		return assettype_name;
	}

	public void setAssettype_name(String assettype_name) {
		this.assettype_name = assettype_name;
	}

	public int getAssettype_id() {
		return assettype_id;
	}

	public void setAssettype_id(int assettype_id) {
		this.assettype_id = assettype_id;
	}

	public AssetTypeService getTypeService() {
		return typeService;
	}

	public String getAssettype_typenum() {
		return assettype_typenum;
	}

	public void setAssettype_typenum(String assettype_typenum) {
		this.assettype_typenum = assettype_typenum;
	}

}
