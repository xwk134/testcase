package Thread_test;
//生产者消费者实现方式一：管程法
public class TestProduce {
    public static void main(String[] args) {
        SyncStack container = new SyncStack();
        new Productor(container).start();
        new Consumer(container).start();
    }
}
//馒头
class Mantou{
    int id;
    Mantou(int id){
        this.id = id;
    }
}
//缓冲区
class SyncStack{
    Mantou[] buns=new Mantou[10];
    int count = 0;//计数器
    //存储 生产
    public synchronized void push(Mantou bun) {
        //何时能生产，容器存在空间
        //不能生产，只有等待
        if(count== buns.length){
            try {
                this.wait();//线程阻塞，消费者通知生产者解除
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //存在空间 可以生产
        buns[count] = bun;
        count++;
        //存在数据了，可以通知消费者了
        this.notifyAll();
    }
    //获取 消费
    public synchronized Mantou pop() {
        //何时消费，容器中是否存在数据
        //没有数据，只有等待
        if(count==0){
            try {
                this.wait();//线程阻塞，生产者通知消费者解除
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //存在数据可以消费
        count--;
        Mantou bun = buns[count];
        this.notifyAll();//存在空间了，可以唤醒对方生产了
        return bun;
    }
}
//生产者
class Productor extends Thread{
    SyncStack container;

    public Productor(SyncStack container){
        this.container = container;
    }

    @Override
    public void run() {
        //生产
        for(int i=1;i<=100;i++){
            System.out.println("生产-->"+i+"个馒头");
            container.push(new Mantou(i));
            if(i==100){
                System.out.println("今日馒头生产任务已完成!");
                Thread.yield();//调用线程的yield()方法；
            }
        }


    }
}
//消费者
class Consumer extends Thread{
    SyncStack container;

    public Consumer(SyncStack container){
        this.container = container;
    }

    @Override
    public void run() {
        //消费
        for(int i=1;i<=200;i++){
            System.out.println("消费-->"+container.pop().id+"个馒头");
            if(i==100){
                System.out.println("今日馒头已买完!");
                Thread.yield();//调用线程的yield()方法；
            }
        }
    }
}

