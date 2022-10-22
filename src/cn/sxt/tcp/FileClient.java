package cn.sxt.tcp;

import java.io.*;
import java.net.Socket;

public class FileClient {

    public static void main(String[] args) throws IOException {
        System.out.println("----client----");
        //建立连接：使用Socket创建客户端+服务的地址和端口
        Socket client=new Socket("localhost",8888);
        //输入输出流操作
        //文件拷贝
        InputStream is = new BufferedInputStream(new FileInputStream("src/test/cs.png"));
        OutputStream os = new BufferedOutputStream(client.getOutputStream());
        byte[] flush = new byte[1024];
        int len = -1;
        while ((len=is.read(flush))!=-1){
            os.write(flush,0,len);
        }
        os.flush();
        //释放资源
        os.close();
        client.close();
    }



}

