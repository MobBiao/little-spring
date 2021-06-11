package org.springframework.beans.factory;

/**
 * bean容器
 */

public interface BeanFactory {
    //根据bean的名字从容器中获取bean实例
    Object getBean(String name) throws BeansException;

    /**
     * 根据名称和类型查找bean
     *
     * @param name
     * @param requiredType
     * @param <T>
     * @return
     * @throws BeansException
     */
    <T> T getBean(String name, Class<T> requiredType) throws BeansException;
}
