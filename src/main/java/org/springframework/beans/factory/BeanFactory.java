package org.springframework.beans.factory;

/**
 * bean容器
 */

public interface BeanFactory {
    //根据bean的名字从容器中获取bean实例
    Object getBean(String name) throws BeansException;
}
