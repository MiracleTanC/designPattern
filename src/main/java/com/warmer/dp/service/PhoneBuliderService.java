package com.warmer.dp.service;

import com.warmer.dp.models.MobilePhone;

public interface PhoneBuliderService {
	void BuildChip(String name);
	void BuildBattery(String name);
	void BuildScreen(String name);
	void BuildSystem(String name);
	MobilePhone buildPhone();
}
