package d_数组;
import java.util.Arrays;

import static java.util.Arrays.sort;

public class b_数组的简单操作 {
    public static void main(String[] args) {
        int[] array_a = {1,9,2,3,34,4,5,6,89};
    //1.数组求最大/小值
        int max = Arrays.stream(array_a).max().getAsInt();
        int min = Arrays.stream(array_a).min().getAsInt();
        System.out.println("max = " + max+", min = " + min);
    //2.求数组的平均值
        double average = Arrays.stream(array_a).sorted().average().getAsDouble();
        System.out.println("average = " + average);
    //3.数组求和
        int sum = Arrays.stream(array_a).sum();
        System.out.println("sum = " + sum);
    //4.数组的排序
        //排序,创建一个新数组
        int[] array_b = Arrays.stream(array_a).sorted().toArray();
        System.out.println("array_b = " + Arrays.toString(array_b));
        //将原数组排序
        sort(array_a);
        System.out.println(Arrays.toString(array_a));


    }
}
