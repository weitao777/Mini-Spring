package com.cqut.atao.springframework.beans.factory.support;

import com.cqut.atao.springframework.beans.BeansException;
import com.cqut.atao.springframework.beans.factory.config.BeanDefinition;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName BeanDefinitionRegistry.java
 * @Description bean注册接口
 * @createTime 2023年07月19日 08:01:00
 */
public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注册 BeanDefinition
     *
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);


    /**
     * 使用Bean名称查询BeanDefinition
     *
     * @param beanName
     * @return
     * @throws BeansException
     */
    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    /**
     * 判断是否包含指定名称的BeanDefinition
     * @param beanName
     * @return
     */
    boolean containsBeanDefinition(String beanName);

    /**
     * Return the names of all beans defined in this registry.
     *
     * 返回注册表中所有的Bean名称
     */
    String[] getBeanDefinitionNames();


}

