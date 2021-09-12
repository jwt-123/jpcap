package jpcap.jw5t.main;

import com.ibm.java.diagnostics.utils.Context;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.ContextResource;
import org.springframework.core.io.Resource;

public class main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Resource resource = new ClassPathResource("applicationContext.xml");
        hello hello = context.getBean("hello", jpcap.jw5t.main.hello.class);
        hello.toString();

    }
}
