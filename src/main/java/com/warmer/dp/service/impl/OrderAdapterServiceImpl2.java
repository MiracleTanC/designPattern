package com.warmer.dp.service.impl;

import com.warmer.dp.service.OrderService;

public class OrderAdapterServiceImpl2 implements OrderService {

	private OrderDetailServiceImpl detailService;

	public OrderAdapterServiceImpl2(OrderDetailServiceImpl detailService) {
		this.detailService = detailService;
	}

	@Override
	public void MakeOrder() {
		System.out.println("保存主表");
	}
	public void MakeDetailOrder() {
		detailService.MakeDetailOrder();
	}

	@Override
	public void GetAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void GetByOrderNo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Delete() {
		// TODO Auto-generated method stub
		
	}
}
