package com.model;

import java.sql.Timestamp;

/**
 * PAsset entity. @author MyEclipse Persistence Tools
 */

public class Asset implements java.io.Serializable {

	// Fields

	private Integer id;
	private Section user_section;
	private User keeper;
	private User user;
	private String name;
	private Integer typeid;
	private Integer instore;
	private Timestamp instoreDate;
	private Integer infinance;
	private String infinaceNum;
	private Timestamp infinaceDate;
	private String standard;
	private Integer status;
	private String maker;
	private String supply;
	private String unit;
	private Integer num;
	private String remark;
	private Float price;

	// Constructors

	/** default constructor */
	public Asset() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Section getUser_section() {
		return user_section;
	}

	public void setUser_section(Section user_section) {
		this.user_section = user_section;
	}

	public User getKeeper() {
		return keeper;
	}

	public void setKeeper(User keeper) {
		this.keeper = keeper;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getTypeid() {
		return typeid;
	}

	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}

	public Integer getInstore() {
		return instore;
	}

	public void setInstore(Integer instore) {
		this.instore = instore;
	}

	public Timestamp getInstoreDate() {
		return instoreDate;
	}

	public void setInstoreDate(Timestamp instoreDate) {
		this.instoreDate = instoreDate;
	}

	public Integer getInfinance() {
		return infinance;
	}

	public void setInfinance(Integer infinance) {
		this.infinance = infinance;
	}

	public String getInfinaceNum() {
		return infinaceNum;
	}

	public void setInfinaceNum(String infinaceNum) {
		this.infinaceNum = infinaceNum;
	}

	public Timestamp getInfinaceDate() {
		return infinaceDate;
	}

	public void setInfinaceDate(Timestamp infinaceDate) {
		this.infinaceDate = infinaceDate;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getSupply() {
		return supply;
	}

	public void setSupply(String supply) {
		this.supply = supply;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	


}