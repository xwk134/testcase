package testcase;

public class Test14 {
    public static void main(String[] args) {
        System.out.println(climbStairs(10));
    }

    static long climbStairs(int n){
        if(n==1) {//递归头
            return 1;
        }else if(n==2){
            return 2;
        }else{//递归体
            return climbStairs(n-1) + climbStairs(n-2);//f(n) = f(n-1) + f(n-2)
        }
    }

}
