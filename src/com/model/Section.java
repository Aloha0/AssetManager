package com.model;

import java.util.HashSet;
import java.util.Set;

/**
 * PSection entity. @author MyEclipse Persistence Tools
 */

public class Section implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
//	private Set users = new HashSet(0);

	// Constructors

	/** default constructor */
	public Section() {
	}


	public Section(int user_depart) {
		id =user_depart;
	}


	/** full constructor */
	

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}



}