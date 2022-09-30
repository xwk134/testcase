package File;

import java.io.File;
import java.io.IOException;

public class TestFile {
    public static void main(String[] args) {
        //指定一个文件
        File file = new File("D:/发送消息/测试.txt");
        //判断该文件是否是存在
        boolean flag = file.exists();
        //如果存在就删除，否则创建
        if(flag) {
            //删除
            boolean flagd = file.delete();
            if (flagd) {
                System.out.println("删除成功");
                //创建
                try {
                    boolean flagn = file.createNewFile();
                    System.out.println("创建成功:"+flagn);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("删除失败");
            }
        }else{
            //创建
            try {
                boolean flagn = file.createNewFile();
                System.out.println("创建成功:"+flagn);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
