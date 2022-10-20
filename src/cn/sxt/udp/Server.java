package cn.sxt.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Server {
    public static void main(String[] args) throws IOException {
        //创建数据包套接字：指定接收信息的端口
        DatagramSocket ds = new DatagramSocket(8999);
        byte[] b = new byte[1024];
        //创建数据包，指定要接收的数据缓存位置和长度
        DatagramPacket dp = new DatagramPacket(b,b.length);
        //接收客户端发送的数据包
        ds.receive(dp);//阻塞式方法
        //返回实际收到的数据的字节数
        String string = new String(dp.getData(),0, dp.getLength());
        System.out.println(string);
        //关闭资源
        ds.close();
    }
}
