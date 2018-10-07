package com.warmer.dp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.warmer.dp.common.AbstractApplePhoneService;
import com.warmer.dp.common.AbstractHuaweiPhoneService;
import com.warmer.dp.common.AbstractOppoPhoneService;
import com.warmer.dp.common.Singleton;
import com.warmer.dp.service.PhoneService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DesignPatternApplication.class)
@WebAppConfiguration
public class SingletonTest {
	/*
	 *单例对象（Singleton）是一种常用的设计模式。在Java应用中，单例对象能保证在一个JVM中，
	 *该对象只有一个实例存在。这样的模式有几个好处：
	 *1、某些类创建比较频繁，对于一些大型的对象，这是一笔很大的系统开销。
	 *2、省去了new操作符，降低了系统内存的使用频率，减轻GC压力。
	 *3、有些类如交易所的核心交易引擎，控制着交易流程，如果该类可以创建多个的话，系统完全乱了。
	 */
	@Test
	public void Do() {
		//断点进去调试
		Singleton s=Singleton.getInstance();
	}
}
