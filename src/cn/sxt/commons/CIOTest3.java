package cn.sxt.commons;

import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CIOTest3 {
    public static void main(String[] args) throws IOException {
        String content = IOUtils.toString(new FileInputStream("D:\\IdeaProjects\\testcase1\\src\\test\\test01"),"gbk");
        System.out.println(content);
    }
}
