package org.springframework.test.aop;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.test.service.HelloService;

import java.lang.reflect.Method;

public class PointcutExpressionTest {

    @Test
    public void testPointcutExpression() throws Exception {
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut("execution(* org.springframework.test.service.HelloService.*(..))");
        Class<HelloService> clazz = HelloService.class;
        Method method = clazz.getDeclaredMethod("sayHello");

        Assert.assertTrue(pointcut.matches(clazz));
        Assert.assertTrue(pointcut.matches(method, clazz));
    }
}
