package com.model;

import java.io.Serializable;

public class PurchaseDetail implements Serializable {

	private int id;
	private AssetType assetType;
	private Purchase purchase;
	private User buger;
	private User keeper;
	private String unit;
	private String type;
	private String name;
	private int num;
	private String remark;
	private String maker;
	private String supply;
	private float price;
	
	public PurchaseDetail(){
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AssetType getAssetType() {
		return assetType;
	}

	public void setAssetType(AssetType assetType) {
		this.assetType = assetType;
	}

	public Purchase getPurchase() {
		return purchase;
	}

	public void setPurchase(Purchase purchase) {
		this.purchase = purchase;
	}

	public User getBuger() {
		return buger;
	}

	public void setBuger(User buger) {
		this.buger = buger;
	}

	public User getKeeper() {
		return keeper;
	}

	public void setKeeper(User keeper) {
		this.keeper = keeper;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}


	
}
