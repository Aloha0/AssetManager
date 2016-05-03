package com.service.impl;

import java.util.List;

import com.dao.ISettingDao;
import com.dao.impl.SettingDao;
import com.model.Section;
import com.model.Setting;
import com.model.User;
import com.service.ISectionService;
import com.service.ISettingService;

public class SettingService implements ISettingService{
	SettingDao setDao;
	public boolean checkInfo(Setting setting){
		if(setting.getName().equals("") || 
				setting.getValue().equals("")||
				setting.getType().equals(""))
			return false;
		return true;
	}
	
	
	@Override
	public Setting get(int id) {
	
		return setDao.get(Setting.class, id);
	}

	@Override
	public Setting getByName(String name) {
		
		return setDao.findByName(name);
	}

	/**
	 * 创建参数 0 成功 1 参数信息错误  2参数名称重复  3 保存失败
	 */
	@Override
	public int create(Setting setting) {
		if(!checkInfo(setting))
			return 1;
		
		if(getByName(setting.getName())!=null)
			return 2;
		
		if(setDao.create(setting)==null)
			return 3;
		return 0;
	}

	
	/**
	 * 更新参数信息 0 成功  1 参数ID错误 2没有此参数 3 参数信息错误 4保存失败
	 */
	@Override
	public int update(Setting setting) {
		if(setting.getId()==0)
			return 1;
		if(setDao.get(Setting.class, setting.getId()) == null)
			return 2;
		if(!checkInfo(setting))
			return 3;
		
		if(setDao.update(setting)==null)
			return 4;
		return 0;
	}

	/**
	 * 删除参数  0 成功 1 参数ID错误   2  删除出错
	 */
	@Override
	public int delete(int settingID) {
		if(settingID<=0)
			return 1;
		Setting setting = new Setting();
		setting.setId(settingID);
		if(setDao.delete(setting))
			return 0;
		return 2;
	}

	@Override
	public List<Setting> findAll() {
		
		return setDao.findAll();
	}

	@Override
	public List<Setting> findByType(String type) {
		return setDao.findByType(type);
	}
	
	
	public void setSetDao(SettingDao setDao) {
		this.setDao = setDao;
	}
	

}
