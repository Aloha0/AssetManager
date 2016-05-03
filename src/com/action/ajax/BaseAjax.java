package com.action.ajax;

import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAjax extends ActionSupport {
	public Map<String, Object> data = null;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}
	
	public Map<String, Object> initMap(){
		if(data == null)
			data = new HashMap<String, Object>();
		else
			data.clear();		
		return data;
	}
	
	public Map<String, Object> getData() {
		return data;
	}
	
	public void setData(Map<String, Object> data) {
		this.data = data;
	}
	
}
