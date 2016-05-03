package com.dao;

import java.util.List;

import com.model.Setting;

public interface ISettingDao {
	public List<Setting> findAll();
		
	public Setting findByName(String setting_name);
	
	public List<Setting> findByType(String type);
}
