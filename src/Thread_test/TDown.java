package Thread_test;

import java.io.IOException;

public class TDown extends Thread {
    private String url;//远程路径
    private String name;//存储名字

    public TDown(String url,String name){
        this.url = url;
        this.name = name;

    }

    @Override
    public void run() {
        Downloader td = new Downloader();
        try {
            td.down(url,name);
            System.out.println(name);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TDown td1 = new TDown("https://c-ssl.dtstatic.com/uploads/blog/202207/25/20220725212717_35c69.thumb.1000_0.jpg_webp","C:\\Users\\Administrator.SC-202101151411\\IdeaProjects\\test1\\src\\test\\cs.png");
        TDown td2 = new TDown("https://c-ssl.dtstatic.com/uploads/blog/202207/25/20220725212717_77bad.thumb.1000_0.jpg_webp","C:\\Users\\Administrator.SC-202101151411\\IdeaProjects\\test1\\src\\test\\cs1.png");
        TDown td3 = new TDown("https://c-ssl.dtstatic.com/uploads/blog/202207/25/20220725212717_2f808.thumb.1000_0.jpg_webp","C:\\Users\\Administrator.SC-202101151411\\IdeaProjects\\test1\\src\\test\\cd2.png");
        //启动线程
        td1.start();
        td2.start();
        td3.start();

    }
}
