package com.warmer.dp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.warmer.dp.common.AbstractApplePhoneService;
import com.warmer.dp.common.AbstractHuaweiPhoneService;
import com.warmer.dp.common.AbstractOppoPhoneService;
import com.warmer.dp.common.ConcreteBuilder;
import com.warmer.dp.models.MobilePhone;
import com.warmer.dp.service.PhoneService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DesignPatternApplication.class)
@WebAppConfiguration
public class BuilderTest {
	/*
	 * 建造者模式实现了依赖倒转原则，抽象不应该依赖细节，细节应该依赖与抽象。
	 * 建造者模式的定义是：将一个复杂对象的构造与它的表示分离，使同样的构建过程可以创建不同的表示，这样的设计模式被称为建造者模式。
	 *　建造者模式的角色定义，在建造者模式中存在以下4个角色：
	 *　1 builder:为创建一个产品对象的各个部件指定抽象接口。
	 *　2 ConcreteBuilder:实现Builder的接口以构造和装配该产品的各个部件，定义并明确它所创建的表示，并提供一个检索产品的接口。
	 *　3 Director:构造一个使用Builder接口的对象。
	 *　4 Product:表示被构造的复杂对象。ConcreteBuilder创建该产品的内部表示并定义它的装配过程，包含定义组成部件的类，包括将这些部件装配成最终产品的接口。
	 */
	@Test
	public void Do() {
		MobilePhone  applephone=constructProduct(new ConcreteBuilder());
		System.out.println(applephone);
	}
	public MobilePhone constructProduct(ConcreteBuilder concreteBuilder){
        concreteBuilder.BuildChip("英特尔");
        concreteBuilder.BuildScreen("三星曲面屏");
        concreteBuilder.BuildBattery("蓝狐锂电池");
        concreteBuilder.BuildSystem("ios");
        return concreteBuilder.buildPhone();
    }
}
