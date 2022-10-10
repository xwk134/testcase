package cn.sxt.io;

import com.sun.deploy.net.FailedDownloadException;

import java.io.*;

public class IOTest01 {
    public static void main(String[] args) {
        //1、创建源
        File src = new File("D:/IdeaProjects/testcase1/src/test/test01");
        //2、选择流
        try {
            InputStream is = new FileInputStream(src);
            try {
                int temp;
                while ((temp=is.read())!=-1){
                    System.out.print(((char)temp));
                }
                //释放资源
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
