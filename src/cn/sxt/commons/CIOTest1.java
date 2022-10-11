package cn.sxt.commons;

import org.apache.commons.io.FileUtils;

import java.io.File;

public class CIOTest1 {
    public static void main(String[] args) {
        //文件大小
        long len = FileUtils.sizeOf(new File("C:\\Users\\Administrator.SC-202101151411\\IdeaProjects\\test1\\src\\test\\test01"));
        System.out.println(len);

    }
}
