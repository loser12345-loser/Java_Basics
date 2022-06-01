package x_各种类;

import java.util.Scanner;

public class a_Math类 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        // 1. abs 求绝对值
        System.out.println(Math.abs(-12));
        // 2. round 四舍五入
        System.out.println(Math.round(10.345));
        // 3. random 给一个随机数
        System.out.println((int)(Math.random()*100));
        // 4. 幂运算
        System.out.println(Math.pow(2,3));
        // 5. 向上取整 ceil()
        System.out.println("Math.ceil(3.9) = " + Math.ceil(3.9));
        // 6. 向下取整 floor()
        System.out.println("Math.floor(3.9) = " + Math.floor(3.9));

        in.close();














    }
}
