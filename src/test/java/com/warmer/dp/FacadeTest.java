package com.warmer.dp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.warmer.dp.common.AbstractApplePhoneService;
import com.warmer.dp.common.AbstractHuaweiPhoneService;
import com.warmer.dp.common.AbstractOppoPhoneService;
import com.warmer.dp.service.PhoneService;
import com.warmer.dp.service.impl.ComputerService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DesignPatternApplication.class)
@WebAppConfiguration
public class FacadeTest {
	
	@Test
	public void Do() {
		ComputerService computer = new ComputerService();  
        computer.startup();  
        computer.shutdown();
	}
}
