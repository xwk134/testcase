package cn.sxt.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class Client {
    public static void main(String[] args) throws IOException {
        byte[] b = "技术部666".getBytes();
        //必须告诉数据包要发送到哪台计算机的哪个端口，发送的数据以及数据的长度
        DatagramPacket dp = new DatagramPacket(b,b.length,new InetSocketAddress("localhost", Integer.parseInt("8999")));
        //创建数据包套接字，指定发送信息的端口
        DatagramSocket ds = new DatagramSocket(9000);
        //发送数据包
        ds.send(dp);
        //关闭资源
        ds.close();

    }
}
