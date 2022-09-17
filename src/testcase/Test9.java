package testcase;

public class Test9 {
    public static void main(String[] args) {
        User[] arr03 = new User[3];
        arr03[0] = new User(1001,"张三");
        arr03[1] = new User(1002,"李四");
        arr03[2] = new User(1003,"王五");
        for(int i=0;i<arr03.length;i++) {
            System.out.println(arr03[i].getName());
        }
    }
}


class User{
    private int id;
    private String name;

    public User(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}