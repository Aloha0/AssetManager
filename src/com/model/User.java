package com.model;

/**
 * PUser entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer id;
	private Section section;
	private String sectionName;
	private Integer roleid;
	private String roleName;
	private String name;
	private String pwd;
	private Integer status;
	private Integer sex;

	// Constructors

	/** default constructor */
	public User() {
	}


	/** full constructor */
	public User(Section PSection, Integer roleid, String name, String pwd,
			Integer status, Integer sex) {
		this.section = PSection;
		this.roleid = roleid;
		this.name = name;
		this.pwd = pwd;
		this.status = status;
		this.sex = sex;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getRoleid() {
		return this.roleid;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getSex() {
		return this.sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}
	
	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}


	public String getSectionName() {
		return sectionName;
	}


	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}


	public String getRoleName() {
		return roleName;
	}


	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

}