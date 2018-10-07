package com.warmer.dp.common;

import com.warmer.dp.service.AbstractFactoryService;
import com.warmer.dp.service.PhoneService;
import com.warmer.dp.service.impl.OppoPhoneServiceImpl;

public class AbstractOppoPhoneService implements AbstractFactoryService{

	@Override
	public PhoneService GetPhoneService() {
		return new OppoPhoneServiceImpl();
	}
}
