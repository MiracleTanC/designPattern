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

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DesignPatternApplication.class)
@WebAppConfiguration
public class AbstractFactoryTest {
	/*
	 * 工厂方法模式有一个问题就是，类的创建依赖工厂类，
	 * 也就是说，如果想要拓展程序，必须对工厂类进行修改，这违背了闭包原则，
	 * 所以，从设计角度考虑，有一定的问题，
	 * 如何解决？
	 * 就用到抽象工厂模式，创建多个工厂类，这样一旦需要增加新的功能，直接增加新的工厂类就可以了，不需要修改之前的代码。
	 * 如果现在新增小米手机，只需添加小米的工厂类和小米手机的实现即可，不用管之前的三个手机
	 */
	@Test
	public void Do() {
		PhoneService phoneService=null;
		phoneService=new AbstractHuaweiPhoneService().GetPhoneService();
		String color1 = phoneService.GetPhoneColor();
		System.out.println(color1);
		phoneService=new AbstractOppoPhoneService().GetPhoneService();
		String color2 = phoneService.GetPhoneColor();
		System.out.println(color2);
		phoneService=new AbstractApplePhoneService().GetPhoneService();
		String color3 = phoneService.GetPhoneColor();
		System.out.println(color3);
	}
}
