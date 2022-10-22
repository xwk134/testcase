package cn.sxt.tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("----server----");
        //指定端口，使用ServerSocket创建服务器
        ServerSocket server = new ServerSocket(8888);
        //阻塞式等待连接accept
        Socket client = server.accept();
        System.out.println("客户端建立连接");
        //输入输出流操作
        DataInputStream dis = new DataInputStream(client.getInputStream());
        String data= dis.readUTF();
        System.out.println(data);
        //释放资源
        dis.close();
        client.close();
    }
}
