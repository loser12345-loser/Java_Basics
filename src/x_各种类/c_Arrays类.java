package x_各种类;

import java.util.Arrays;

/*
1.Arrays 数组工具类
    1.Arrays.toString() 打印数组(字符串格式)
    2.Arrays.sort() 排序 小-大
    */
public class c_Arrays类 {
    public static void main(String[] args) {
       int [] array_a={1,3,4,6,8,7};
    //1.Arrays.toString() 打印数组(字符串格式)
        System.out.println("Arrays.toString(array_a) = " + Arrays.toString(array_a));
    //2.Arrays.sort() 排序 小-大
        Arrays.sort(array_a);
        System.out.println(Arrays.toString(array_a));
       
    }
}
