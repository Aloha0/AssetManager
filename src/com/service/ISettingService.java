package com.service;

import java.util.List;

import com.model.Setting;

public interface ISettingService {

	public Setting get(int id);
	
	public Setting getByName(String name);
	
	public int create(Setting setting);
	
	public int update(Setting setting);
	
	public int delete(int settingID);

	public List<Setting> findAll();
	
	public List<Setting> findByType(String type);
		
}
