package org.springframework.test.ioc;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

public class BeanDefinitionAndBeanDefinitionRegistryTest {

    @Test
    public void testBeanFactory() throws Exception {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("foo", "hello"));
        propertyValues.addPropertyValue(new PropertyValue("bar", "world"));
        BeanDefinition beanDefinition = new BeanDefinition(HelloBean.class, propertyValues);
        beanFactory.registerBeanDefinition("helloBean", beanDefinition);

        HelloBean helloBean = (HelloBean) beanFactory.getBean("helloBean");
        System.out.println(helloBean.toString());
        Assert.assertEquals(helloBean.getFoo(), "hello");
        Assert.assertEquals(helloBean.getBar(), "world");
    }
}
