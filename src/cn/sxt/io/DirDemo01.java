package cn.sxt.io;

import java.io.File;

public class DirDemo01 {
    public static void main(String[] args) {
        File dir = new File("C:/Users/Administrator.SC-202101151411/IdeaProjects/test1/src/test");
        //创建目录
        boolean flag = dir.mkdirs();
        System.out.println(flag);
        //列出下级名称 list
        String[] subNames = dir.list();
        for(String s:subNames){
            System.out.println(s);
        }

        //下级对象 listFiles()
        File[] subFiles = dir.listFiles();
        for(File s:subFiles){
            System.out.println(s.getAbsoluteFile());
        }

        //所有盘符
        File[] roots = dir.listRoots();
        for(File r:roots){
            System.out.println(r.getAbsolutePath());
        }

    }
}

