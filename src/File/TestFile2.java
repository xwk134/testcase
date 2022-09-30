package File;
import java.io.File;

//遍历目录文件
public class TestFile2 {
    public static void main(String[] args) {
        File f = new File("d:/【2022最最最新录制】付费课 Python爬虫APP逆向+js逆向，从基础入门到抓包逆向实战");
        printFile(f, 0);
    }
    /**
     * 打印文件信息
     * @param file 文件名称
     * @param level 层次数(实际就是：第几次递归调用)
     */
    static void printFile(File file, int level) {
        //输出层次数
        for (int i = 0; i < level; i++) {
            System.out.print("-");
        }
        //输出文件名
        System.out.println(file.getName());
        //如果file是目录，则获取子文件列表，并对每个子文件进行相同的操作
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File temp : files) {
                //递归调用该方法：注意等+1
                printFile(temp, level + 1);
            }
        }
    }
}