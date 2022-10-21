package cn.sxt.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
//接收端
public class UdpTalkServer {
    public static void main(String[] args) throws IOException {
        //创建数据包套接字：指定接收信息的端口
        DatagramSocket ds = new DatagramSocket(8999);
        while(true){
            byte[] b = new byte[1024*60];
            //创建数据包，指定要接收的数据缓存位置和长度
            DatagramPacket dp = new DatagramPacket(b,b.length);
            //接收客户端发送的数据包
            ds.receive(dp);//阻塞式方法
            //返回实际收到的数据的字节数
            byte[] datas = dp.getData();
            int len = dp.getLength();
            String data = new String(datas,0,len);
            System.out.println(data);
        }
    }
}
