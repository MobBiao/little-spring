package org.springframework.beans.factory.config;

/**
 * 单例注册表
 */
public interface SingletonBeanRegistry {

    //返回单例对象
    Object getSingleton(String beanName);
}
