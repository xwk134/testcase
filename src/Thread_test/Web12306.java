package Thread_test;

public class Web12306 implements Runnable {
    //票数
    private int ticketNums = 99;

    @Override
    public void run() {
        while (true){
            if(ticketNums<0){
                break;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"------>"+ticketNums--);
        }
    }

    public static void main(String[] args) {
        Web12306 web = new Web12306();
        new Thread(web,"张三").start();
        new Thread(web,"李四").start();
        new Thread(web,"王五").start();
    }
}
