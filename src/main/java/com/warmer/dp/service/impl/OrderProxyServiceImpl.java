package com.warmer.dp.service.impl;

import com.warmer.dp.service.OrderDetailService;

public class OrderProxyServiceImpl implements  OrderDetailService{

	private OrderDetailService service;
	
	public OrderProxyServiceImpl(OrderDetailService service){
		this.service=service;
	}
	
	@Override
	public void MakeDetailOrder() {
		service.MakeDetailOrder();
		writeLog();
	}

	@Override
	public void IsContanisProduct() {
		service.IsContanisProduct();
		writeLog();
	}
	private void writeLog(){
		System.out.println("记录日志");
	}

}
