package testcase;

public class Test7 {
    public static void main(String[] args) {
        int[] s = null; //声明数组
        s = new int[10];    //给数组分配空间
        for (int i = 0; i<10; i++) {
            s[i] = 2 * i + 1; //给数组元素赋值
            System.out.println(s[i]);
        }
    }
}
