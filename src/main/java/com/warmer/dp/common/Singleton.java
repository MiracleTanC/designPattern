package com.warmer.dp.common;

public class Singleton {
	 /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */  
    private static Singleton instance = null;  
  
    /* 私有构造方法，防止被实例化 */  
    private Singleton() {  
    }  
  
    /* 1.静态工程方法，创建实例 */  
   /* public static Singleton getInstance() {  
        if (instance == null) {  
            instance = new Singleton();  
        }  
        return instance;  
    } */ 
    /*
     * 2.多线程的环境下 线程安全保护  加 synchronized 
     */
    /*public static synchronized Singleton getInstance() {  
        if (instance == null) {  
            instance = new Singleton();  
        }  
        return instance;  
    }  */
    /*
     * 3.但是，synchronized关键字锁住的是这个对象，
     * 这样的用法，在性能上会有所下降，因为每次调用getInstance()，
     * 都要对对象上锁，事实上，只有在第一次创建对象的时候需要加锁，之后就不需要了
     */
    /*public static Singleton getInstance() {  
        if (instance == null) {  
            synchronized (instance) {  
                if (instance == null) {  
                    instance = new Singleton();  
                }  
            }  
        }  
        return instance;  
    } */ 
    /*
     * 4.单例模式使用内部类来维护单例的实现，JVM内部的机制能够保证当一个类被加载的时候，这个类的加载过程是线程互斥的。
     * 这样当我们第一次调用getInstance的时候，JVM能够帮我们保证instance只被创建一次，
     * 并且会保证把赋值给instance的内存初始化完毕。
     * 同时该方法也只会在第一次调用的时候使用互斥机制，这样就解决了低性能问题
     */
    /* 此处使用一个内部类来维护单例 */  
    private static class SingletonFactory {  
        private static Singleton instance = new Singleton();  
    }  
  
    /* 获取实例 */  
    public static Singleton getInstance() {  
        return SingletonFactory.instance;  
    }  
    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */  
    public Object readResolve() {  
        return instance;  
    }  
}
