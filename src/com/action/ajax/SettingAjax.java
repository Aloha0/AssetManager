package com.action.ajax;

import java.util.List;
import com.model.Section;
import com.model.Setting;
import com.model.User;
import com.service.impl.SectionService;
import com.service.impl.SettingService;
import com.service.impl.UserService;

public class SettingAjax extends BaseAjax {
	public String setting_name="",setting_type="",setting_val = "";
	public int setting_id;
	private SettingService settingService;
	
	private String[] createResult = {"创建系统参数成功","参数信息错误","系统参数名称重复","创建系统参数失败"};	
	private String[] updateResult = {"修改系统参数成功","参数ID错误","没有此参数","参数信息错误","系统错误，修改失败"};	
	private String[] deleteResult = {"删除系统参数成功","参数ID错误","系统错误，删除失败"};	

	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}
	
	
	public void init(){
		setting_name = setting_type = setting_val = "";

	}
	
	public String list(){
		data = initMap();

		data.put("status", 0);
		data.put("total", 0);
		data.put("data", settingService.findAll() );		
		return SUCCESS;
	}
	
	public String create() {
		
		System.out.println("insert setting : "+setting_name+"-"+setting_val+"-"+setting_type);
		
		Setting tmp = new Setting(setting_name, setting_val, setting_type);
		int res = settingService.create(tmp);
		data = initMap();
		data.put("status", res);
		data.put("msg", createResult[res]);
		
		init();
		return SUCCESS;
	}
	
	
	public String update() {
		Setting tmp = new Setting(setting_name, setting_val, setting_type);
		tmp.setId(setting_id);
		int res = settingService.update(tmp);
		

		data = initMap();
		data.put("status", res);
		data.put("msg", updateResult[res]);
		init();
		return SUCCESS;
	}
	
	public String remove() {
		System.out.println("删除参数： ID : "+setting_id);
		int res = settingService.delete(setting_id);

		data = initMap();
		data.put("status", res);
		data.put("msg", deleteResult[res]);
		init();

		return SUCCESS;
	}


	public String getSetting_name() {
		return setting_name;
	}


	public void setSetting_name(String setting_name) {
		this.setting_name = setting_name;
	}


	public String getSetting_type() {
		return setting_type;
	}


	public void setSetting_type(String setting_type) {
		this.setting_type = setting_type;
	}


	public String getSetting_val() {
		return setting_val;
	}


	public void setSetting_val(String setting_val) {
		this.setting_val = setting_val;
	}


	public int getSetting_id() {
		return setting_id;
	}


	public void setSetting_id(int setting_id) {
		this.setting_id = setting_id;
	}


	public SettingService getSettingService() {
		return settingService;
	}


	public void setSettingService(SettingService settingService) {
		this.settingService = settingService;
	}

}
