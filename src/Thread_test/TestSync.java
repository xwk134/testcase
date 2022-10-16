package Thread_test;

public class TestSync {
    public static void main(String[] args) {
        Account a1 = new Account(100, "建设银行");

        Drawing draw1 = new Drawing(80,"张三",a1);
        Drawing draw2 = new Drawing(90, "李静",a1);
        draw1.start(); // 你取钱
        draw2.start(); // 你老婆取钱
    }
}
//简单表示银行账户
class Account {
    int money;
    String aname;
    public Account(int money, String aname) {
        super();
        this.money = money;
        this.aname = aname;
    }
}
//模拟提款操作
class Drawing extends Thread{
    int drawingNum;//取多少钱
    String name;//取款人名字
    Account account;//要取钱的账户
    int expenseTotal;//总共取的钱数

    public Drawing(int drawingNum,String name,Account account){
        this.drawingNum = drawingNum;
        this.name = name;
        this.account = account;
    }

    @Override
    public void run() {
        draw();
    }

    void draw(){
        synchronized (account){
            if(account.money-drawingNum<0){
                System.out.println(this.getName()+name+"---"+account.aname+":余额不足！");
                return;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            account.money -= drawingNum;
            expenseTotal += drawingNum;

        }
        System.out.println(this.getName()+name+"---"+account.aname+"---账户余额："+account.money);
        System.out.println(this.getName()+name+"---"+account.aname+"---总共取了："+expenseTotal);
    }
}