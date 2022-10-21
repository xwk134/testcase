package cn.sxt.udp;
//发送端

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class TalkSend implements Runnable{
    private DatagramSocket client;
    private BufferedReader reader;
    private String toIP;
    private int toPort;
    public TalkSend(int port,String toIP,int toPort){
        this.toPort = toPort;
        this.toIP = toIP;
        try {
            client = new DatagramSocket(port);
            reader = new BufferedReader(new InputStreamReader(System.in));
        } catch (SocketException e) {
            e.printStackTrace();
        }

    }
    @Override
    public void run() {
        while(true){
            String data = null;
            try {
                data = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            byte[] b = data.getBytes();
            //必须告诉数据包要发送到哪台计算机的哪个端口，发送的数据以及数据的长度
            DatagramPacket dp = new DatagramPacket(b,b.length,new InetSocketAddress(this.toIP, this.toPort));
            //创建数据包套接字，指定发送信息的端口
            DatagramSocket ds = null;
            try {
                ds = new DatagramSocket(9000);
            } catch (SocketException e) {
                e.printStackTrace();
            }
            //发送数据包
            try {
                ds.send(dp);
            } catch (IOException e) {
                e.printStackTrace();
            }
            //关闭资源
            ds.close();
        }
    }
}
