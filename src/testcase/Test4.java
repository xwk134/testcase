package testcase;

public class Test4 {
    public static void main(String[] args) {
        Test4 ts = new Test4();
        int c = ts.add(20, 39, 59)*5;
        System.out.println(c);
        int e = ts.add(12, 45, 67, 89);
        System.out.println(e);
    }

    int add(int a, int b, int c) {
        int sum = a+b+c;
        return sum;
    }

    int add(int a, int b, int c, int d) {
        int sum = a+b+c+d;
        return sum;
    }
}
