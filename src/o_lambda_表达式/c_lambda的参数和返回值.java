package o_lambda_表达式;

import java.util.Arrays;
import java.util.Comparator;

public class c_lambda的参数和返回值 {
    public static void main(String[] args) {
    //1.使用数组存储多个Person对象
        c0_person[] a = {
                new c0_person(11, "aa"),
                new c0_person(13, "bb"),
                new c0_person(15, "cc"),
                new c0_person(12, "dd"),
                new c0_person(14, "ee"),
        };
    //2.按年龄进行排序
        //1.使用匿名内部类
        Arrays.sort(a, new Comparator<c0_person>() {
            @Override
            public int compare(c0_person o1, c0_person o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        System.out.println(Arrays.toString(a));
        //2.使用lambda_简化匿名内部类
        Arrays.sort(a,(c0_person o1,c0_person o2)->{
            return o1.getAge() - o2.getAge();
        });
        System.out.println(Arrays.toString(a));
        //3.lambda_极简式
        Arrays.sort(a,((o1, o2) -> o1.getAge()-o2.getAge()));

    }
}
