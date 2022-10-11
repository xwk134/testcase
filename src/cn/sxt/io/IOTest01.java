package cn.sxt.io;

import com.sun.deploy.net.FailedDownloadException;

import java.io.*;

public class IOTest01 {
    public static void main(String[] args) {
        //1、创建源
        File src = new File("C:/Users/Administrator.SC-202101151411/IdeaProjects/test1/src/test/test01");
        //2、选择流
        FileOutputStream fos = null;
        String string = "nextcloud\r";
        try {
            // true表示内容会追加到文件末尾；false表示重写整个文件内容。
            fos = new FileOutputStream("C:/Users/Administrator.SC-202101151411/IdeaProjects/test1/src/test/test01", true);
            //该方法是直接将一个字节数组写入文件中; 而write(int n)是写入一个字节
            try {
                fos.write(string.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
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
