package com.warmer.dp.service.impl;

public class MyBridgeOrder extends BridgeOrder{
	public void MakeDetailOrder(){  
		getOrderDetail().MakeDetailOrder();  
    }  
	public void IsContanisProduct(){  
		getOrderDetail().IsContanisProduct(); 
    } 
}
