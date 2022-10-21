package Thread_test;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;

//快乐影院
public class HappyCinema {
    public static void main(String[] args) {
        //可用位置
        List<Integer> available = new ArrayList<>();
        available.add(1);
        available.add(3);
        available.add(5);
        available.add(7);
        available.add(9);
        //刘克林要抢的位置
        List<Integer> seats1 = new ArrayList<>();
        seats1.add(3);

        //张江松要抢的位置
        List<Integer> seats2 = new ArrayList<>();
        seats2.add(3);
        seats2.add(5);

        Cinema c = new Cinema(available,"快乐影院");
        new Thread(new Customer(c,seats1),"刘克林").start();
        new Thread(new Customer(c,seats2),"张江松").start();
        System.out.println("欢迎光临快乐影院，本次抢票的组合为："+seats1+seats2);
    }
}
//顾客
class Customer implements Runnable{
    Cinema cinema;
    List<Integer> seats;
    public Customer(Cinema cinema, List<Integer> seats){
        this.cinema=cinema;
        this.seats=seats;
    }

    @Override
    public void run() {
        synchronized (cinema){
            boolean flag = cinema.bookTickets(seats);
            if(flag) {

                System.out.println("出票成功：" + Thread.currentThread().getName() + "-<位置为：" + seats);
            }else{
                System.out.println("出票失败：" + Thread.currentThread().getName() + "-<位置被抢");
            }
        }

    }
}
//影院
class Cinema{
    List<Integer> available; //可用的位置
    String name; //名称
    public Cinema(List<Integer> available,String name){
        this.available=available;
        this.name=name;

    }

    //购票
    public boolean bookTickets(List<Integer> seats){
        System.out.println("可用位置为："+available);
        List<Integer> copy = new ArrayList<Integer>();
        copy.addAll(available);
        //相减
        copy.removeAll(seats);
        //判断大小
        if(available.size()-copy.size()!=seats.size()){
            return false;
        }
        available =copy;
        return true;
    }
}