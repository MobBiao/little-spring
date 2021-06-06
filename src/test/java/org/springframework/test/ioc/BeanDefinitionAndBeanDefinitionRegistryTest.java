package org.springframework.test.ioc;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

public class BeanDefinitionAndBeanDefinitionRegistryTest {

    @Test
    public void testBeanFactory() throws Exception {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(HelloBean.class);
        beanFactory.registerBeanDefinition("HelloBean", beanDefinition);

        HelloBean helloBean = (HelloBean) beanFactory.getBean("HelloBean");
        Assert.assertNotNull(helloBean);
        Assert.assertEquals(helloBean.sayHello(), "Hello");
    }
}
