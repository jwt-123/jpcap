package jpcap.jw5t.main;

import org.springframework.stereotype.Service;
import jpcap.jw5t.main.*;


@Service("menu")
public class menu {
    public void mainMenu(){
        System.out.println("====================请选择使用的功能=================");
        System.out.println("1. 开始捕获当前网卡的数据包");
        System.out.println("2. 停止捕获当前网卡的数据包");
        System.out.println("3. 显示当前网卡捕获的数据包");
        System.out.println("4. 显示当前网卡捕获的数据包");
        System.out.println("5. 查看当前网卡数据包详细信息");
    }

    public void networkStateOpen(){
        System.out.println("====================当前网卡状态=================");
        System.out.println("====================使用中=================");
    }


    public void networkStateClose(){
        System.out.println("====================当前网卡状态=================");
        System.out.println("====================关闭中=================");
    }





}
