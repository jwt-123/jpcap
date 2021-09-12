package org.example;

import jpcap.jw5t.javaConfig;
import jpcap.jw5t.main.hello;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

public class test {
    @Test
    public void test(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        hello hello2 = context.getBean("hello",hello.getHello());
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(javaConfig.class);
        annotationConfigApplicationContext.getBean("hello");


//        hello hello = context.getBean("hello", jpcap.jw5t.main.hello.class);
        System.out.println(hello);
    }
}
