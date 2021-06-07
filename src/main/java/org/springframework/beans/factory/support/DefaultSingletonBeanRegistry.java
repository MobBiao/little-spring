package org.springframework.beans.factory.support;

import org.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private Map<String, Object> singletonObjects = new HashMap<>();

    //源码是分别通过一级二级三级缓存来获取Bean，并且加锁
    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    //源码是在Bean实例完成创建之后，只保留一级缓存以及注册beanName的顺序，二三级缓存清除
    protected void addSingleton(String beanName, Object singletonObject) {
        this.singletonObjects.put(beanName, singletonObject);
    }
}
