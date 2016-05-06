package com.model;

import java.sql.Timestamp;


public class AssetReturn implements java.io.Serializable{
	private Integer id;
	private User recipient;
	private User returner;
	private Asset asset;
	private Timestamp gettime;
	private Timestamp returntime;
	private Integer status;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public User getRecipient() {
		return recipient;
	}
	public void setRecipient(User recipient) {
		this.recipient = recipient;
	}
	public User getReturner() {
		return returner;
	}
	public void setReturner(User returner) {
		this.returner = returner;
	}
	public Asset getAsset() {
		return asset;
	}
	public void setAsset(Asset asset) {
		this.asset = asset;
	}
	public Timestamp getGettime() {
		return gettime;
	}
	public void setGettime(Timestamp gettime) {
		this.gettime = gettime;
	}
	public Timestamp getReturntime() {
		return returntime;
	}
	public void setReturntime(Timestamp returntime) {
		this.returntime = returntime;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	
}
