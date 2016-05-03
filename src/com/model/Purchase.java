package com.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

public class Purchase implements Serializable {
	private int id;
	private User user;
	private Section user_section;
	private Timestamp purchase_time;
	private String purpose;
	private int status;
	private PurchaseDetail detail;
	
	public Purchase(){
		purchase_time = new Timestamp(System.currentTimeMillis()); 
		status = 0;
		detail = null;
		user = null;
		user_section = null;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Section getUser_section() {
		return user_section;
	}

	public void setUser_section(Section user_section) {
		this.user_section = user_section;
	}

	public Timestamp getPurchase_time() {
		return purchase_time;
	}

	public void setPurchase_time(Timestamp purchase_time) {
		this.purchase_time = purchase_time;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public PurchaseDetail getDetail() {
		return detail;
	}

	public void setDetail(PurchaseDetail detail) {
		this.detail = detail;
	}
	
	
}
