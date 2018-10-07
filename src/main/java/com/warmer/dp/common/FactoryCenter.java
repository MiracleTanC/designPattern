package com.warmer.dp.common;

import com.warmer.dp.service.PhoneService;
import com.warmer.dp.service.impl.ApplePhoneServiceImpl;
import com.warmer.dp.service.impl.HuaweiPhoneServiceImpl;
import com.warmer.dp.service.impl.OppoPhoneServiceImpl;

public class FactoryCenter {
	
	/**
	 * 1.普通工厂
	 * @param name
	 * @return
	 */
	 public PhoneService GetPhoneInstance(String name) {  
			if (name.equals("huawei")) {
				return new HuaweiPhoneServiceImpl();
			} else if (name.equals("oppo")) {
				return new OppoPhoneServiceImpl();
			} else if(name.equals("apple")){
				return new ApplePhoneServiceImpl();
	        } else {  
	            System.out.println("请输入正确的类型!");  
	            return null;  
	        }  
	    } 
	 
	
}
