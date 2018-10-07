package com.warmer.dp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.warmer.dp.service.PhoneService;
import com.warmer.dp.common.FactoryCenter;
import com.warmer.dp.common.StaticFactoryCenter;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DesignPatternApplication.class)
@WebAppConfiguration
public class FactoryMethodTest {

	/*
	 * 工厂模式适合：凡是出现了大量的产品需要创建，并且具有共同的接口时，可以通过工厂方法模式进行创建。
	 * 在下边两种模式中，第一种如果传入的字符串有误，不能正确创建对象，第二种相对于第一种，不需要实例化工厂类，
	 * 所以，大多数情况下，我们会选用第二种——静态工厂方法模式。
	 */
	/**
	 * 普通工厂
	 */
	@Test
	public void Do() {
		PhoneService phoneService = null;
		FactoryCenter factoryCenter=new FactoryCenter();
		String name = "huawei";
		phoneService=factoryCenter.GetPhoneInstance(name);
		String color1 = phoneService.GetPhoneColor();
		System.out.println(color1);
		name = "oppo";
		phoneService=factoryCenter.GetPhoneInstance(name);
		String color2 = phoneService.GetPhoneColor();
		System.out.println(color2);
		name = "apple";
		phoneService=factoryCenter.GetPhoneInstance(name);
		String color3 = phoneService.GetPhoneColor();
		System.out.println(color3);
	}
	/*
	 * 静态工厂
	 */
	@Test
	public void Do2() {
		PhoneService phoneService = null;
		phoneService = StaticFactoryCenter.getHuaweiPhoneInstance();
		String color1 = phoneService.GetPhoneColor();
		System.out.println(color1);
		phoneService = StaticFactoryCenter.getOppoPhoneInstance();
		String color2 = phoneService.GetPhoneColor();
		System.out.println(color2);
		phoneService = StaticFactoryCenter.getApplePhoneInstance();
		String color3 = phoneService.GetPhoneColor();
		System.out.println(color3);
	}

}
