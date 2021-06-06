package org.springframework.test.ioc;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;

public class BeanFactoryTest {

    @Test
    public void getBean() {
        BeanFactory beanFactory = new BeanFactory();
        beanFactory.registerBean("helloBean", new HelloBean());
        HelloBean helloBean = (HelloBean) beanFactory.getBean("helloBean");
        Assert.assertNotNull(helloBean);
        Assert.assertEquals("Hello", helloBean.sayHello());
    }

    class HelloBean {
        public String sayHello() {
            System.out.println("Hello");
            return "Hello";
        }
    }
}