package com.warmer.dp;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.warmer.dp.models.Resume;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DesignPatternApplication.class)
@WebAppConfiguration
public class PrototypeTest {

	/* 参考博文：https://www.cnblogs.com/chenssy/p/3313339.html
	 * 原型模式就是用原型实例指定创建对象的种类，并且通过复制这些原型创建新的对象。
	 * 所发动创建的对象只需要知道原型对象的类型就可以获得更多的原型实例对象，至于这些原型对象时如何创建的根本不需要关心。
	 * 浅拷贝：使用一个已知实例对新创建实例的成员变量逐个赋值，这个方式被称为浅拷贝。
	 * 深拷贝：当一个类的拷贝构造方法，不仅要复制对象的所有非引用成员变量值，还要为引用类型的成员变量创建新的实例，并且初始化为形式参数实例值。
	 * 原型模式主要包含如下三个角色：
       Prototype：抽象原型类。声明克隆自身的接口。 
       ConcretePrototype：具体原型类。实现克隆的具体操作。 
       Client：客户类。让一个原型克隆自身，从而获得一个新的对象。
	 */
	@Test
	public void Do() throws ClassNotFoundException, IOException{
		//原型A对象
        Resume a = new Resume("小李子");
        a.setPersonInfo("2.16", "男", "XX大学");
        a.setWorkExperience("2012.09.05", "XX科技有限公司");
        //a @2b6fcb9f
        //克隆B对象
        Resume b = (Resume) a.clone();
        //b @75de6341
        //输出A和B对象
        System.out.println("----------------A--------------");
        a.display();
        System.out.println("----------------B--------------");
        b.display();
        
        /*
         * 测试A==B?
         * 对任何的对象x，都有x.clone() !=x，即克隆对象与原对象不是同一个对象
         */
        System.out.print("A==B?");
        System.out.println( a == b);
        
        /*
         * 对任何的对象x，都有x.clone().getClass()==x.getClass()，即克隆对象与原对象的类型一样。
         */
        System.out.print("A.getClass()==B.getClass()?");
        System.out.println(a.getClass() == b.getClass());
        
        
        //深复制、
      //克隆B对象
        Resume c= (Resume) a.deepClone();
        //c @64d4f7c7
        //输出A和B对象
        System.out.println("----------------A--------------");
        a.display();
        System.out.println("----------------C--------------");
        c.display();
        
        /*
         * 测试A==B?
         * 对任何的对象x，都有x.clone() !=x，即克隆对象与原对象不是同一个对象
         */
        System.out.print("A==C?");
        System.out.println( a == c);
        
        /*
         * 对任何的对象x，都有x.clone().getClass()==x.getClass()，即克隆对象与原对象的类型一样。
         */
        System.out.print("A.getClass()==C.getClass()?");
        System.out.println(a.getClass() == c.getClass());
	}
}
