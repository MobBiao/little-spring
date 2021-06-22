package org.springframework.context;

import org.springframework.beans.factory.Aware;
import org.springframework.beans.factory.BeansException;

/**
 * 实现该接口，能感知所属ApplicationContext
 */
public interface ApplicationContextAware extends Aware {
    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
