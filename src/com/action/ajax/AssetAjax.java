package com.action.ajax;

import java.util.List;
import com.model.Section;
import com.model.Setting;
import com.model.User;
import com.service.impl.AssetService;
import com.service.impl.SectionService;
import com.service.impl.SettingService;
import com.service.impl.UserService;

public class AssetAjax extends BaseAjax {

	private AssetService assetService;
	
	private String[] createResult = {"采购成功","采购信息错误","系统错误,采购失败"};	
	private String[] updateResult = {"修改系统参数成功","参数ID错误","没有此参数","参数信息错误","系统错误，修改失败"};	
	private String[] deleteResult = {"删除系统参数成功","参数ID错误","系统错误，删除失败"};	

	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}
	
	
	public void init(){


	}
	
	public String list(){
		data = initMap();
		List list = assetService.findAll();
		data.put("status", 0);
		data.put("total", list.size());
		data.put("data", list);		
		return SUCCESS;
	}
	
	public String create() {
		
//		System.out.println("insert setting : "+setting_name+"-"+setting_val+"-"+setting_type);
//		
//		Setting tmp = new Setting(setting_name, setting_val, setting_type);
//		int res = settingService.create(tmp);
//		data = initMap();
//		data.put("status", res);
//		data.put("msg", createResult[res]);
//		
//		init();
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


	public AssetService getAssetService() {
		return assetService;
	}


	public void setAssetService(AssetService assetService) {
		this.assetService = assetService;
	}


}
