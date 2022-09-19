package testcase;

import java.util.Arrays;

public class Test14 {
    public static void main(String[] args) {
        System.out.println(climbStairs(10));
    }

    public static int climbStairs(int n) {
        int[] step = new int[n+1];
        if (n<2){
            return n;
        }
        step[1] = 1;
        step[2] =2;
        for (int i=3; i<step.length;i++) {
            step[i] = step[i-1] + step[i-2];
            System.out.println(step[i]);
        }
        System.out.println(Arrays.toString(step));
        return step[n];
    }
}
