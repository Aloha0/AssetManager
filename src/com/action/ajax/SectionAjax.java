package com.action.ajax;

import java.util.List;
import com.model.Section;
import com.service.impl.SectionService;

public class SectionAjax extends BaseAjax {
	SectionService sectionService = null;
	Section section;
	String section_name = "";
	int section_id = 0;
	private String[] createResult = {"创建部门成功","创建部门失败","部门信息不完整"};	
	private String[] updateResult = {"修改部门成功","修改部门失败","部门ID错误"};	
	private String[] deleteResult = {"删除部门成功","创建部门失败","部门ID错误"};	


	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}
	
	
	public String list(){
		data = initMap();
		List<Section> list  = sectionService.findSections();

		data.put("status", 0);
		data.put("total", list.size());
		data.put("data", list );
		
		return SUCCESS;
	}
	
	public String create() {
		System.out.println("insert section : "+section_name);
		int res = 0;
		if(section_name.equals(""))
			res = 2;
		else{
			Section tmp = new Section();
			tmp.setName(section_name);
			res = sectionService.create(tmp);
		}
		data = initMap();
		data.put("status", res);
		data.put("msg", createResult[res]);
		section_name = "";
		return SUCCESS;
	}
	
	
	public String update() {
		int res = 0;
		System.out.println(section_id + "--"+section_name);
		if(section_id<=0 || section_name.equals(""))
			res = 2;
		else{
			Section tmp = new Section();
			tmp.setId(section_id);
			tmp.setName(section_name);
			res = sectionService.update(tmp);
		}
		data = initMap();
		data.put("status", res);
		data.put("msg", updateResult[res]);
		section_id = -1;
		section_name = "";
		return SUCCESS;
	}
	
	public String remove() {
		int res = 0;
		if(section_id <= 0 )
			res = 2;
		else{
			res = sectionService.delete(section_id);
		}
		data = initMap();
		data.put("status", res);
		data.put("msg", deleteResult[res]);
		section_id = -1;

		return SUCCESS;
	}
	
	public void setSection(Section section) {
		this.section = section;
	}
	
	public Section getSection() {
		return section;
	}
	
	public void setSectionService(SectionService sectionService) {
		this.sectionService = sectionService;
	}

	public String getSection_name() {
		return section_name;
	}

	public void setSection_name(String section_name) {
		this.section_name = section_name;
	}

	public int getSection_id() {
		return section_id;
	}

	public void setSection_id(int section_id) {
		this.section_id = section_id;
	}


}
