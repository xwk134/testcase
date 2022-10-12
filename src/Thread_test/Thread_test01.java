package Thread_test;

public class Thread_test01 extends Thread {
    @Override
    public void run() {
        for(int i=0;i<209;i++){
            System.out.println("一边听歌");
        }
    }

    public static void main(String[] args) {
        //创建子类对象
        Thread_test01 st = new Thread_test01();
        //启动
        st.start();
        for(int i=0;i<209;i++){
            System.out.println("一边敲代码");
        }
    }


}
