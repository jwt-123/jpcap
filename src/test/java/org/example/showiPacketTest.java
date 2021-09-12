package org.example;

import jpcap.jw5t.information.displayNetworkInformation;
import jpcap.jw5t.javaConfig;
import jpcap.jw5t.main.AThread;
import jpcap.jw5t.main.menu;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import jpcap.jw5t.*;

public class showiPacketTest {
    @Test
    public void showiPacketTest(){
        AnnotationConfigApplicationContext ctx =new AnnotationConfigApplicationContext(javaConfig.class);
        displayNetworkInformation information = ctx.getBean("information", displayNetworkInformation.class);
//        menu menu = ctx.getBean("menu", menu.class);
//        AThread aThread = ctx.getBean("AThread", AThread.class);
        information.showPacket();


    }
}
