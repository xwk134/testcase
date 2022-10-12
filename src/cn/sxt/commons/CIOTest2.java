package cn.sxt.commons;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CIOTest2 {
    public static void main(String[] args) throws IOException {
        FileUtils.copyDirectory(new File("D:\\IdeaProjects\\testcase1\\src\\test"), new File("D:\\IdeaProjects\\testcase1\\src\\test1"));
    }
}
