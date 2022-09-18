package testcase;
import java.util.Arrays;
public class Test11 {
    public static void main(String[] args) {
        int[] a = {1,3,2,4,7,5};
        System.out.println(Arrays.toString(a));//打印数组元素的值
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println("该元素的索引："+Arrays.binarySearch(a,5)); //二分查找
        Arrays.fill(a,1,3,100); //将1到3索引的元素替换为100
        System.out.println(Arrays.toString(a));
    }
}
