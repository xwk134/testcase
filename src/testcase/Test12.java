package testcase;

import java.util.Arrays;

public class Test12 {
    public static void main(String[] args) {
        int[][] a = new int[4][];
        a[0] = new int[] {1,2,3};
        a[1] = new int[] {1,3,5};
        a[2] = new int[] {2,4,6,5,8};
        a[3] = new int[] {2,4,6,5};
        System.out.println(a[2][4]);
        System.out.println(Arrays.toString(a[2]));
        //获取的二维数组第一维数组的长度。
        System.out.println(a.length);
        //获取第二维第一个数组长度。
        System.out.println(a[0].length);
    }
}
