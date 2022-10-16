package Thread_test;

public class TestYield {
    public static void main(String[] args) {
        StateThread thread1 = new StateThread();
        thread1.start();
        StateThread thread2 = new StateThread();
        thread2.start();
    }
}

//使用继承的方式实现多线程
class StateThread extends Thread{
    @Override
    public void run() {
        for(int i = 0;i<100;i++){
            System.out.println(this.getName() +":"+i);
            Thread.yield();//调用线程的yield()方法
        }
    }
}
