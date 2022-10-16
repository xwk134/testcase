package Thread_test;

public class TestThread03 {
    public static void main(String[] args) {
        God god = new God();
        Yous yous = new Yous();
        Thread t = new Thread(god);
        t.setDaemon(true);//将用户线程调整为守护
        t.start();
        //new Thread(god).start();
        new Thread(yous).start();
    }
}

class Yous implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<365*100;i++){
            System.out.println("happy life");
        }
        System.out.println("OOOOOOOOO");
    }
}

class God implements Runnable{
    @Override
    public void run() {
        for(;true;){
            System.out.println("bless you");
        }
    }
}