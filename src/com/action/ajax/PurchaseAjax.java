package com.action.ajax;

import java.util.List;

import com.model.AssetType;
import com.model.Purchase;
import com.model.PurchaseDetail;
import com.model.Section;
import com.model.Setting;
import com.model.User;
import com.service.impl.PurchaseService;
import com.service.impl.SectionService;
import com.service.impl.SettingService;
import com.service.impl.UserService;

public class PurchaseAjax extends BaseAjax {
	private PurchaseService pService;
	private String[] createResult = {"采购入库成功","创建采购信息失败","采购信息错误"};	
	
	public String purpose="",asset_name="",asset_model="",unit="",maker=""
			,supply="",remark="";
	public int num,asset_type_id;
	public float price;

	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}
	
	
	public boolean check_info() {
		if(asset_name.equals("") )//|| unit.equals("")
			return false;
		if(num<=0 || price<=0)
			return false;
		return true;
	}
	
	public void init(){
		purpose=asset_name=asset_model=unit=maker=supply=remark="";
		num=asset_type_id=0;
		price = 0;
	}
	
	public String list(){
		data = initMap();
		List list = pService.findAll();
		
		data.put("status", 0);
		data.put("data", list);		
		return SUCCESS;
	}
	
	public String create() {
		System.out.println("采购 : "+asset_name+"  "+remark);
		data = initMap();
		if(!check_info()){
			data.put("status", 2);
			data.put("msg", createResult[2]);
			return SUCCESS;
		}
		
		
		Purchase tmp = new Purchase();
		tmp.setPurpose(purpose);
		
		PurchaseDetail detail = new PurchaseDetail();
		detail.setName(asset_name);
		detail.setMaker(maker);
		detail.setSupply(supply);
		detail.setUnit(unit);
		detail.setNum(num);
		detail.setRemark(remark);
		detail.setPrice(price);
		detail.setType(asset_model);
		detail.setAssetType(new AssetType(asset_type_id));
		
		
		tmp.setDetail(detail);
		
		int res = pService.create(tmp);
		data.put("status", res);
		data.put("msg", createResult[res]);
//		
		init();
		return SUCCESS;
	}
	
	
	public String update() {
//		Setting tmp = new Setting(setting_name, setting_val, setting_type);
//		tmp.setId(setting_id);
//		int res = settingService.update(tmp);
//		
//
//		data = initMap();
//		data.put("status", res);
//		data.put("msg", updateResult[res]);
//		init();
		return SUCCESS;
	}
	
	public String remove() {
//		System.out.println("删除参数： ID : "+setting_id);
//		int res = settingService.delete(setting_id);
//
//		data = initMap();
//		data.put("status", res);
//		data.put("msg", deleteResult[res]);
//		init();

		return SUCCESS;
	}


	public PurchaseService getpService() {
		return pService;
	}


	public void setpService(PurchaseService pService) {
		this.pService = pService;
	}


	public String getPurpose() {
		return purpose;
	}


	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}


	public String getAsset_name() {
		return asset_name;
	}


	public void setAsset_name(String asset_name) {
		this.asset_name = asset_name;
	}


	public String getAsset_model() {
		return asset_model;
	}


	public void setAsset_model(String asset_model) {
		this.asset_model = asset_model;
	}


	public String getUnit() {
		return unit;
	}


	public void setUnit(String unit) {
		this.unit = unit;
	}


	public String getMaker() {
		return maker;
	}


	public void setMaker(String maker) {
		this.maker = maker;
	}


	public String getSupply() {
		return supply;
	}


	public void setSupply(String supply) {
		this.supply = supply;
	}


	public String getRemark() {
		return remark;
	}


	public void setRemark(String remark) {
		this.remark = remark;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public int getAsset_type_id() {
		return asset_type_id;
	}


	public void setAsset_type_id(int asset_type_id) {
		this.asset_type_id = asset_type_id;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}




}
