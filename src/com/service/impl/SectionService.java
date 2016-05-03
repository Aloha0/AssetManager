package com.service.impl;

import java.util.List;

import com.dao.impl.SectionDao;
import com.model.Section;
import com.model.User;
import com.service.ISectionService;

public class SectionService implements ISectionService{
	private SectionDao sectionDao;
	
	@Override
	public int create(Section section) {
		try {
			sectionDao.create(section);
			return 0;
		} catch (Exception e) {
			e.printStackTrace();
			return 1;
		}
	}

	
	/**
	 * 更新部门 0 成功 2未找到 1 失败
	 */
	@Override
	public int update(Section section) {
		try {
			if(get(section.getId())== null)
				return 2;
			sectionDao.update(section);
			return 0;
		} catch (Exception e) {
			e.printStackTrace();
			return 1;
		}		
	}

	@Override
	public List<User> findSectionUser(String sectionID) {
		try {
			return sectionDao.findSectionUsers(sectionID);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void setSectionDao(SectionDao sectionDao) {
		this.sectionDao = sectionDao;
	}

	@Override
	public List<Section> findSections() {
		return sectionDao.findSections();
	}

	/**
	 * 删除部门 0 成功 1未找到 2 删除失败
	 */
	@Override
	public int delete(int sectionID) {
		try {
			Section section = new Section();
			section.setId(sectionID);
			if(section.getId()<=0 || get(sectionID)==null)
				return 1;
			
			sectionDao.delete(section);
			return 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 2;
	}

	@Override
	public Section get(int id) {
		try {
			return sectionDao.get(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
