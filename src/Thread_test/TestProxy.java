package Thread_test;

public class TestProxy {
    public static void main(String[] args) {
        new Company(new You()).happyMarry();
    }
}

interface Marry{
    void happyMarry();
}
//真实角色
class You implements Marry{
    @Override
    public void happyMarry() {
        System.out.println("今天结婚的日子，你很高兴");
    }
}

//代理角色
class Company implements Marry{
    //真实角色
    private Marry target;

    public Company(Marry target) {
        this.target = target;
    }

    @Override
    public void happyMarry() {
        ready();
        this.target.happyMarry();
        after();

    }

    private void ready(){
        System.out.println("布置新房");
    }
    private void after(){
        System.out.println("闹洞房");
    }
}