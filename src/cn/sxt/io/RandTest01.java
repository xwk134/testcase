package cn.sxt.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;
import java.util.RandomAccess;

public class RandTest01 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(new File("D:\\IdeaProjects\\testcase1\\src\\test1\\test.jpg"),"r");
        //起始位置
        int beginPos = 2;
        //实际大小
        int actuaISize = 1026;
        //随机读取
        raf.seek(beginPos);
        //分段读取
        byte[] flush = new byte[1024];//缓冲容器
        int len = -1;//接收长度
        while ((len = raf.read(flush))!=-1){
            if(actuaISize>len) { //获取本次读取的内容
                System.out.println(new String(flush, 0, len));
                actuaISize -= len;

            }else{
                System.out.println(new String(flush, 0, actuaISize));
                break;
            }

        }
        raf.close();

    }
    //指定起始位置，读取剩余内容
    public static void test1() throws IOException {
        RandomAccessFile raf = new RandomAccessFile(new File("D:\\IdeaProjects\\testcase1\\src\\test1\\test.jpg"),"r");
        //随机读取
        raf.seek(2);
        //分段读取
        byte[] flush = new byte[1024];//缓冲容器
        int len = -1;//接收长度
        while ((len = raf.read(flush))!=-1){
            System.out.println(new String(flush,0,len));
        }
        raf.close();
    }
}
