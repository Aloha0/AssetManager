package com.dao;


import java.util.List;

import com.model.Section;
import com.model.User;

public interface ISectionDao {
	public Section get(int id);
	
	public List<User> findSectionUsers(String sectionID);
	
	public List<Section> findSections();
	
}
