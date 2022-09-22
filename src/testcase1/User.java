package testcase1;

public class User {
    int id;
    String name;
    String pwd;

    static String company = "江西南昌";

    public User(int id,String name){
        this.id = id;
        this.name = name;
    }
    public User(int id,String name,String pwd){
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }


    public static void printCompany(){
        System.out.println(company);
    }

    public static void main(String[] args) {
        User u2 = new User(101,"张三");
        User u3 = new User(102,"李四","123456");
        System.out.println("他的名字是："+u2.name);
        System.out.println("他的名字是："+u3.name+" 密码："+u3.pwd);
        company = "江西吉安";
        printCompany();
    }
}

