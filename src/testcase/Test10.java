package testcase;

public class Test10 {
    public static void main(String[] args) {
        String[] x = {"a","b","c","d"};
        String[] y = new String[10];
        System.arraycopy(x,1,y,7,3);
        for(int i=0;i<y.length;i++){
            System.out.println(y[i]);
        }

    }
}
