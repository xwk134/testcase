package cn.sxt.tcp;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {
        System.out.println("----client----");
        //建立连接：使用Socket创建客户端+服务的地址和端口
        Socket client=new Socket("localhost",8888);
        //输入输出流操作
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
        String data="hello";
        dos.writeUTF(data);
        dos.flush();
        //释放资源
        dos.close();
        client.close();
    }



}

