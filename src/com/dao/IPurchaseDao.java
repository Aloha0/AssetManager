package com.dao;

import java.util.List;

import com.model.Purchase;
import com.model.PurchaseDetail;

public interface IPurchaseDao {
	public List<Purchase> findAll();
	
	public PurchaseDetail getChaseDetail(int  id);
	
	public Purchase remove(int id);
}
