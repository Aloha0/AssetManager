package com.service;

import java.util.List;

import com.model.Purchase;

public interface IPurchaseService {
	public Purchase get(int id);
		
	public int create(Purchase chase);
	
	public int update(Purchase chase);
	
	public int delete(int purchaseID);

	public List<Purchase> findAll();

}
