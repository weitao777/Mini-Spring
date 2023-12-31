package com.cqut.atao.springframework.beans.factory.config;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName SingletonBeanRegistry.java
 * @Description 单例bean注册接口
 * @createTime 2023年07月18日 16:07:00
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

    /**
     * 销毁单例对象
     */
    void destroySingletons();

    void registerSingleton(String beanName, Object singletonObject);

}
