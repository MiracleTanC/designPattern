package com.warmer.dp.service.impl;

import com.warmer.dp.service.OrderDetailService;

public class DecoratorOrderServicesImpl implements OrderDetailService {

	private OrderDetailService source;

	public DecoratorOrderServicesImpl(OrderDetailService source) {
		super();
		this.source = source;
	}

	@Override
	public void MakeDetailOrder() {
		System.out.println("do other thing here");
		source.MakeDetailOrder();
		System.out.println("do other thing here");

	}

	@Override
	public void IsContanisProduct() {
		System.out.println("do other thing here");
		source.IsContanisProduct();
		System.out.println("do other thing here");
	}

}
