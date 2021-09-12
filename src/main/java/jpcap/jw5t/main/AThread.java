package jpcap.jw5t.main;

import jpcap.JpcapCaptor;
import jpcap.packet.Packet;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jpcap.jw5t.information.displayNetworkInformation;

import jpcap.jw5t.*;

import java.io.IOException;

//数据包捕获线程
@Data
@Service("AThread")
public  class AThread implements Runnable{

    private Thread thread;
    private JpcapCaptor captor;
    private Packet[] packet;
    //线程中断标志
    volatile boolean cancel;


    AThread() throws IOException {
    }


    AThread(JpcapCaptor captor) throws IOException {
        this.captor = captor;
        this.packet = new Packet[displayNetworkInformation.max];
        this.cancel = false;
        thread = new Thread(this);
    }

    @Override
    public void run() {
        packet = new Packet[displayNetworkInformation.max];
        for(int i = 0; i < displayNetworkInformation.max && cancel == false; i++){
            packet[i] = captor.getPacket();
        }
    }

    public void cancel(){
        cancel = true;
    }

    public Packet[] getPacket(){
        return packet;
    }

}