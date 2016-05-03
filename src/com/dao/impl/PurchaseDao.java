package com.dao.impl;

import java.util.List;

import com.dao.IPurchaseDao;
import com.model.Purchase;
import com.model.PurchaseDetail;

public class PurchaseDao extends BaseDao implements IPurchaseDao{

	@Override
	public List<Purchase> findAll() {
		try {
			return getHibernateTemplate().find("from Purchase order by id desc");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public PurchaseDetail getChaseDetail(int id) {
		return get(PurchaseDetail.class, id);
	}

	@Override
	public Purchase remove(int id) {
		try {
			Purchase tmp = get(Purchase.class, id);
			tmp.setStatus(-1);
			return (Purchase) update(tmp);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
