package com.model;

import java.io.Serializable;

public class Setting implements Serializable{
	private int id;
	private String name;
	private String value;
	private String type;
	
	public Setting(){
	
	}
	
	public Setting(String _name,String _value,String _type){
		name = _name;
		value = _value;
		type = _type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
