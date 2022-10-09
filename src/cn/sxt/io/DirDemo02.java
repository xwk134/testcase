package cn.sxt.io;

import java.io.File;

public class DirDemo02 {
    //大小
    private long len;
    //文件夹路径
    private String path;
    //文件个数
    private int fielSize=-1;
    //文件夹个数
    private int dirSize;
    //源
    private File src;
    public DirDemo02(String path){
        this.path = path;
        this.src = new File(path);
        count(this.src);
    }

    public static void main(String[] args) {
        DirDemo02 dir = new DirDemo02("C:/Users/Administrator.SC-202101151411/IdeaProjects/test1/src");
        System.out.println(dir.getLen()+"---"+ dir.getFielSize()+"---"+ dir.getDirSize());
    }
    //统计大小
    private void count(File src){
        //获取大小
        if(null!=src&&src.exists()){
            if(src.isFile()) { //大小
                len += src.length();
                this.fielSize++;
            }else{ //子孙级
                this.dirSize++;
                for(File s:src.listFiles()){
                    count(s);
                }
            }
        }
    }

    public long getLen() {
        return len;
    }

    public int getFielSize() {
        return fielSize;
    }

    public int getDirSize() {
        return dirSize;
    }
}
