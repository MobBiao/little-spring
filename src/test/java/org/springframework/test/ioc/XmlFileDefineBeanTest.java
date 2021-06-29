package org.springframework.test.ioc;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.test.bean.Car;
import org.springframework.test.bean.Person;

public class XmlFileDefineBeanTest {

    @Test
    public void testXmlFile() throws Exception {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        beanDefinitionReader.loadBeanDefinitions("classpath:spring.xml");

        Person person = (Person) beanFactory.getBean("person");
        System.out.println(person);
        Assert.assertEquals(person.getName(), "biao");
        Assert.assertEquals(person.getCar().getBrand(), "porsche");

        Car car = (Car) beanFactory.getBean("car");
        System.out.println(car);
        Assert.assertEquals(car.getBrand(), "porsche");
    }
}
