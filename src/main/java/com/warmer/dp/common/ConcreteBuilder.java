package com.warmer.dp.common;

import com.warmer.dp.models.MobilePhone;
import com.warmer.dp.service.PhoneBuliderService;

public class ConcreteBuilder implements PhoneBuliderService{

	private MobilePhone mobilePhone;
	    
    public ConcreteBuilder(){
    	mobilePhone=new MobilePhone();
    }
	@Override
	public void BuildChip(String name) {
		mobilePhone.setChip(name);
	}

	@Override
	public void BuildBattery(String name) {
		mobilePhone.setBattery(name);
	}

	@Override
	public void BuildScreen(String name) {
		mobilePhone.setScreen(name);
	}

	@Override
	public void BuildSystem(String name) {
		mobilePhone.setSystem(name);
	}

	@Override
	public MobilePhone buildPhone() {
		return mobilePhone;
	}

}
