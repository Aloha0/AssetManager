package com.service.impl;

import java.util.List;

import com.dao.impl.PurchaseDao;
import com.model.Purchase;
import com.service.IPurchaseService;

public class PurchaseService implements IPurchaseService {
	PurchaseDao pDao ;
	
	@Override
	public Purchase get(int id) {
		return pDao.get(Purchase.class, id);

	}

	@Override
	public int create(Purchase chase) {
		if(pDao.create(chase)==null)
			return 1;
		return 0;
	}

	@Override
	public int update(Purchase chase) {
		if(pDao.update(chase)==null)
			return 1;
		return 0;
	}

	@Override
	public int delete(int purchaseID) {
		if(pDao.remove(purchaseID)==null)
			return 1;
		return 0;
	}

	@Override
	public List<Purchase> findAll() {
		
		return pDao.findAll();
	}

	public PurchaseDao getpDao() {
		return pDao;
	}

	public void setpDao(PurchaseDao pDao) {
		this.pDao = pDao;
	}

}
