package com.warmer.dp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.warmer.dp.service.impl.DecoratorOrderServicesImpl;
import com.warmer.dp.service.impl.OrderDetailServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DesignPatternApplication.class)
@WebAppConfiguration
public class DecoratorTest {

	/*
	 * 装饰模式（Decorator）
	顾名思义，装饰模式就是给一个对象增加一些新的功能，而且是动态的，要求装饰对象和被装饰对象实现同一个接口，装饰对象持有被装饰对象的实例
	 */
	@Test
	public void Do(){
		OrderDetailServiceImpl detail=new OrderDetailServiceImpl();
		DecoratorOrderServicesImpl service=new DecoratorOrderServicesImpl(detail);
		service.IsContanisProduct();
		service.MakeDetailOrder();
	}
}
