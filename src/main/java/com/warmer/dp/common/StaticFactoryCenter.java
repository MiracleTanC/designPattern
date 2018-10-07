package com.warmer.dp.common;

import com.warmer.dp.service.PhoneService;
import com.warmer.dp.service.impl.ApplePhoneServiceImpl;
import com.warmer.dp.service.impl.HuaweiPhoneServiceImpl;
import com.warmer.dp.service.impl.OppoPhoneServiceImpl;

public class StaticFactoryCenter {
	
	
	/**
	 * 2.静态工厂
	 * @return
	 */
	 public static PhoneService getHuaweiPhoneInstance(){ 
		 return new HuaweiPhoneServiceImpl();
	 }
	 public static PhoneService getOppoPhoneInstance(){  
	     return new OppoPhoneServiceImpl(); 
	 }
	 public static PhoneService getApplePhoneInstance(){ 
	     return new ApplePhoneServiceImpl(); 
	 }
}
