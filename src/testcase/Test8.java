package testcase;

public class Test8 {
    public static void main(String[] args) {
        int[] a = new int[4];
        //初始化数组元素的值
        for(int i=0;i<a.length;i++) {
            a[i] = 1000*i+1;
        }
        //读取元素的值
        for(int i=0;i<a.length;i++) {
            System.out.println(a[i]);
        }

        for(int m:a) {
            System.out.println(m);
        }
    }
}
