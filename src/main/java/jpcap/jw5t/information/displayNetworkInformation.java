package jpcap.jw5t.information;


import jpcap.JpcapCaptor;
import jpcap.NetworkInterface;
import jpcap.packet.Packet;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.print.attribute.standard.PrinterResolution;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Scanner;

@Data
//@Repository("information")
@Service("information")
public class displayNetworkInformation {
    Scanner scanner = new Scanner(System.in);

    //本机内网ip地址
    private static final String sourceIP = "192.168.84.129";

    //目标发送ip地址
    //学校机房交换机
    private static final String targetIP = "192.168.84.254";

    //抓包数
    public static final int max = 1024;

    //存放数据包
    public Packet[] packet = new Packet[max];

    //获取网络信息并显示
    public NetworkInterface[] devices = JpcapCaptor.getDeviceList();

    public int  card = 1;

    public int showPacket(){
        System.out.println("======================下列为网卡设备=============================");

        try {

            for (int i = 0 ; i<devices.length  ; i++){
                System.out.println((i+1)+"号网卡: "+devices[i].description);
                // 此处就是想吐槽一下，此处原本只能显示网卡地址，搞来搞去搞半天 都用不了名字，折腾了好久
                // 还有莫名其妙的数组越界错误

                //解决了，此处我原本是devices[i] != null来判断长度，c++写习惯了，以为这里有个指针啥的   java 由于需要访问到null才会停止，但是这个访问的过程就
                //必然会导致越界，只要访问到就会抛出错误，就会报错。    现在我使用 数组.length 来判断数组长度
            }
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }finally {
            System.out.print("输入选择监听的网卡序号:");

            int card = scanner.nextInt(); //选择硬件的编号
            card--; //因为前面是从0开始，所以此处自减

            System.out.println("==================================================================");
        }

        return card;
    }


    //网络接口监听
    public JpcapCaptor openDevice(NetworkInterface[] devices, int choice) throws java.io.IOException{//传入网卡的具体数据，加上选择
        JpcapCaptor captor = null;
        try{
            captor = JpcapCaptor.openDevice(devices[choice], 65535, false, 3000);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("打开网络接口失败！");
        }
        return captor;
    }


}
