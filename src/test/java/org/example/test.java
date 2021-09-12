package org.example;

import jpcap.jw5t.javaConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import jpcap.jw5t.information.*;

public class test {
    @Test
    public void test(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        hello hello2 = context.getBean("hello",hello.getHello());

        AnnotationConfigApplicationContext ctx =new AnnotationConfigApplicationContext(javaConfig.class);
//        Macro macro = ctx.getBean("information", Macro.class);
        System.out.println(System.getProperty("java.library.path")); //检查jpcap是否能正常运行
    }
}
