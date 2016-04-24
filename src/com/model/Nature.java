package com.model;

public class Nature implements java.io.Serializable {
	private Integer id;
	private String name;
	private String value;
	private Integer typeid;
	private String typename;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public Integer getTypeid() {
		return typeid;
	}
	
	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}
	
	public String getTypename() {
		return typename;
	}
	
	public void setTypename(String typename) {
		this.typename = typename;
	}
	
}
