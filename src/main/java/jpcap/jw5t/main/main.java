package jpcap.jw5t.main;
import jpcap.JpcapCaptor;
import jpcap.jw5t.information.displayNetworkInformation;
import jpcap.jw5t.javaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import jpcap.jw5t.main.menu;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx =new AnnotationConfigApplicationContext(javaConfig.class);

        //检查jpcap是否能正常运行
        System.out.println(System.getProperty("java.library.path"));

        //bean注入
        displayNetworkInformation information = ctx.getBean("information", displayNetworkInformation.class);
        menu menu = ctx.getBean("menu", menu.class);
        AThread aThread = ctx.getBean("AThread", AThread.class);

        /*
        基础配置
         */

        //输入流
        Scanner scanner = new Scanner(System.in);
        //先初始化数据包捕获的线程
        AThread t = null;

        //展示网卡并选择，返回选择的网卡
        information.showPacket();


//        JpcapCaptor captor = openDevice(devices, card);





    }
}
