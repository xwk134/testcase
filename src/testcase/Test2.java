package testcase;

public class Test2 {
    public static void main(String[] args) {
        for (int j=1; j<=9; j++) {      //j是一个乘数,最大值为9
            for (int i=1; i<=9; i++) {      //i是另一个乘数,最大值为9
            if (j >= i) {   //i的值必须小于等于j
                System.out.print(i + "*" + j + "=" + i*j + "\t");
            }
            }
            System.out.println();   //换行
        }
    }
}
