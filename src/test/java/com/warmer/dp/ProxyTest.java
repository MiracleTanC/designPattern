package com.warmer.dp;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.warmer.dp.service.OrderDetailService;
import com.warmer.dp.service.impl.OrderDetailServiceImpl;
import com.warmer.dp.service.impl.OrderProxyServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DesignPatternApplication.class)
@WebAppConfiguration
public class ProxyTest {
	/*
	 * 代理模式的应用场景：
		如果已有的方法在使用的时候需要对原有的方法进行改进，此时有两种办法：
		1、修改原有的方法来适应。这样违反了“对扩展开放，对修改关闭”的原则。
		2、就是采用一个代理类调用原有的方法，且对产生的结果进行控制。这种方法就是代理模式。
		使用代理模式，可以将功能划分的更加清晰，有助于后期维护
	 */
	// 静态代理
	@Test
	public void Do() {
		OrderProxyServiceImpl service = new OrderProxyServiceImpl(
				new OrderDetailServiceImpl());
		service.MakeDetailOrder();
	}

	// 动态代理
	@Test
	public void Do2() {
		OrderDetailServiceImpl orderService = new OrderDetailServiceImpl();
		OrderDetailService proxy = (OrderDetailService) Proxy.newProxyInstance(
				orderService.getClass().getClassLoader(),orderService.getClass().getInterfaces(), new InvocationHandler() {
					// 回调方法 拦截到目标对象的时候执行
					@Override
					public Object invoke(Object proxy, Method method,
							Object[] args) throws Throwable {
						System.out.println("在 代理对象 中拦截到：" + method.getName());
						Object o = method.invoke(orderService, args);// 调用拦截到的方法
						return o;
					}

				});
		proxy.MakeDetailOrder();
	}
}
