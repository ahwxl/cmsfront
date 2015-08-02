package com.bplow.netconn.base.utils;

import java.util.Comparator;

import com.bplow.netconn.base.dao.Order;

public class OrderComparator implements Comparator<Order>{

	
	
	@Override
	public int compare(Order self, Order orther) {
		return self.getOrderId() - orther.getOrderId();
	}

}
