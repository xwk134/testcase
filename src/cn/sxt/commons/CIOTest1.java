package cn.sxt.commons;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CIOTest1 {
    public static void main(String[] args) throws IOException {
        //文件大小
        long len = FileUtils.sizeOf(new File("D:\\IdeaProjects\\testcase1\\src\\test\\test01"));
        System.out.println(len);
        //读取文件内容
        String content = FileUtils.readFileToString(new File("D:\\IdeaProjects\\testcase1\\src\\test\\test01"),"gbk");
        System.out.println(content);
    }
}
