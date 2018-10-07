package com.warmer.dp.service.impl;

import com.warmer.dp.service.OrderDetailService;

public abstract  class BridgeOrder {

	private OrderDetailService orderDetail;

	public OrderDetailService getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDetail(OrderDetailService orderDetail) {
		this.orderDetail = orderDetail;
	}
	public void MakeDetailOrder(){  
		orderDetail.MakeDetailOrder();  
    }  
	public void IsContanisProduct(){  
		orderDetail.IsContanisProduct(); 
    } 
}
