package com.warmer.dp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.warmer.dp.service.impl.OrderAdapterServiceImpl;
import com.warmer.dp.service.impl.OrderAdapterServiceImpl2;
import com.warmer.dp.service.impl.OrderAdapterServiceImpl3;
import com.warmer.dp.service.impl.OrderDetailServiceImpl;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DesignPatternApplication.class)
@WebAppConfiguration
public class AdapterTest {

	//参考博文 ：https://www.cnblogs.com/V1haoge/p/6479118.html
	/*
	 * 1、类适配器模式：
　　   原理：通过继承来实现适配器功能。
　　   当我们要访问的接口A中没有我们想要的方法 ，却在另一个接口B中发现了合适的方法，
	我们又不能改变访问接口A，在这种情况下，我们可以定义一个适配器p来进行中转，
	这个适配器p要实现我们访问的接口A，这样我们就能继续访问当前接口A中的方法，
	然后再继承接口B的实现类BB，这样我们可以在适配器P中访问接口B的方法了，
	这时我们在适配器P中的接口A方法中直接引用BB中的合适方法，这样就完成了一个简单的类适配器。
	 */
	@Test
	public void Do(){
		OrderAdapterServiceImpl orderService=new OrderAdapterServiceImpl();
		orderService.MakeOrder();//保存主表
		orderService.MakeDetailOrder();//保存明细表
		orderService.GetAll();
		orderService.Delete();
	}
	/**
	 * 2、对象适配器模式
　　   原理：通过组合来实现适配器功能。
　　	当我们要访问的接口A中没有我们想要的方法 ，却在另一个接口B中发现了合适的方法，我们又不能改变访问接口A，
	在这种情况下，我们可以定义一个适配器p来进行中转，这个适配器p要实现我们访问的接口A，这样我们就能继续访问当前接口A中的方法，
	然后在适配器P中定义私有变量C（对象）（B接口指向变量名），
	再定义一个带参数的构造器用来为对象C赋值，
	再在A接口的方法实现中使用对象C调用其来源于B接口的方法。
	 */
	@Test
	public void Do2(){
		OrderAdapterServiceImpl2 orderService=new OrderAdapterServiceImpl2(new OrderDetailServiceImpl());
		orderService.MakeOrder();//保存主表
		orderService.MakeDetailOrder();//保存明细表
		orderService.GetAll();
		orderService.Delete();
		
	}
	/*
	 * 3、接口适配器模式
　　   原理：通过抽象类来实现适配，这种适配稍别于上面所述的适配。
　　   当存在这样一个接口，其中定义了N多的方法，而我们现在却只想使用其中的一个到几个方法，
	如果我们直接实现接口，那么我们要对所有的方法进行实现，
	哪怕我们仅仅是对不需要的方法进行置空（只写一对大括号，不做具体方法实现）也会导致这个类变得臃肿，调用也不方便，
	这时我们可以使用一个抽象类作为中间件，即适配器，用这个抽象类实现接口，而在抽象类中所有的方法都进行置空，
	那么我们在创建抽象类的继承类，而且重写我们需要使用的那几个方法即可。
	 */
	@Test
	public void Do3(){
		OrderAdapterServiceImpl3 orderService=new OrderAdapterServiceImpl3();
		orderService.MakeOrder();//保存主表
		orderService.GetAll();
		//orderService.MakeDetailOrder();
	}
}
