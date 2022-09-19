package testcase;
import java.util.Arrays;

public class Test13 {
    public static void main(String[] args) {
        int[] values = {12,31,3,2,5,4,9,8,0,7,6};
        bubbleSort(values);
        System.out.println(Arrays.toString(values));
    }

   public static void bubbleSort(int[] values) {
        int temp;
        //外层循环：n个元素排序，则需要n-1次循环
        for (int i=0; i<values.length-1;i++) {

            //定义一个布尔类型变量，标记数组是否达到有序状态
            boolean flag = true;
            //内层循环，每一次循环都从数组的前两个元素开始比较
            for (int j=0; j<values.length-1-i;j++) {

                //如果前一个元素大于后一个元素，则交换两元素的值
                if (values[j]>values[j+1]) {
                    temp = values[j];
                    values[j] = values[j+1];
                    values[j+1] = temp;
                    //本次循环发生了交换，表明该数组处在无序状态，需要比较
                    flag = false;
                }
                System.out.println(Arrays.toString(values));

            }
            //判断数组状态是否有序，如果为有序则退出，否则继续循环
            if(flag){
                System.out.println("排序完成");
                break;
            }
            System.out.println("**************************************************************");
        }
   }
}
