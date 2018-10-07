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
	装饰器模式的应用场景：
	1、需要扩展一个类的功能。
	2、动态的为一个对象增加功能，而且还能动态撤销。（继承不能做到这一点，继承的功能是静态的，不能动态增删。）
	缺点：产生过多相似的对象，不易排错！
	 */
	@Test
	public void Do(){
		OrderDetailServiceImpl detail=new OrderDetailServiceImpl();
		DecoratorOrderServicesImpl service=new DecoratorOrderServicesImpl(detail);
		service.IsContanisProduct();
		service.MakeDetailOrder();
	}
}
