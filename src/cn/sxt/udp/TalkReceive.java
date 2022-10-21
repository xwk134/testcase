package cn.sxt.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

//接收端
public class TalkReceive implements Runnable {
    private DatagramSocket server;
    private String from;
    public TalkReceive(int port,String from){
        this.from = from;
        try {
            server = new DatagramSocket(port);
        } catch (SocketException e) {
            e.printStackTrace();
        }

    }
    @Override
    public void run() {
        while(true){
            byte[] b = new byte[1024*60];
            //创建数据包，指定要接收的数据缓存位置和长度
            DatagramPacket dp = new DatagramPacket(b,b.length);
            //接收客户端发送的数据包
            try {
                server.receive(dp);//阻塞式方法
            } catch (IOException e) {
                e.printStackTrace();
            }
            //返回实际收到的数据的字节数
            byte[] datas = dp.getData();
            int len = dp.getLength();
            String data = new String(datas,0,len);
            System.out.println(from+":"+data);
        }
    }
}
