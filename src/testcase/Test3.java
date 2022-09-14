package testcase;

public class Test3 {
    public static void main(String[] args) {
        int i=0;
        int sum=0;
        int sum1=0;
        int sum2=0;
        while (i < 100) {
            i++;
            if(i%2==1) {
                System.out.println("奇数：" + i);
                sum = sum + i;
            }else{
                System.out.println("偶数：" + i);
                sum1 = sum1 + i;
            }

        }
        sum2 = sum+sum1;
        System.out.println("奇数和："+sum);
        System.out.println("偶数和："+sum1);
        System.out.println("总和："+ sum2);
    }
}
