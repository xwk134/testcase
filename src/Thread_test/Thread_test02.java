package Thread_test;

public class Thread_test02 implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<20;i++){
            System.out.println("一边听歌");
        }
    }

    public static void main(String[] args) {
        //创建子类对象
        //Thread_test02 st = new Thread_test02();
        //启动
        new Thread(new Thread_test02()).start();
        for(int i=0;i<20;i++){
            System.out.println("一边敲代码");
        }
    }


}
