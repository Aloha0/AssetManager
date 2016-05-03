package com.action;

import com.model.Section;
import com.opensymphony.xwork2.ActionSupport;
import com.service.impl.SectionService;

public class SectionAction extends BaseAction {
	private SectionService sectionService;
	private Section section;
	
	@Override
	public String execute() throws Exception {
		System.out.println("section action========");
		
		
		return "none";
	}
	
	public String create() throws Exception{
		System.out.println("create Section "+section.getName());
		int res = sectionService.create(section);
		if(res==0)
			return "createSuccess";
		return "createFail";
	}
	
	public void setSectionService(SectionService sectionService) {
		this.sectionService = sectionService;
	}

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}
}
