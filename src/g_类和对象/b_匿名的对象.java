package g_类和对象;

import java.util.Scanner;

public class b_匿名的对象 {
    public static void main(String[] args) {
    //1.只使用一次,主要是调用某类的方法
        System.out.println(new a_标准的类("xiao",34).toString());
    //2.匿名对象的使用
        int num = new Scanner(System.in).nextInt();     //输入一个数
        //匿名对象作为参数传递
        a(new Scanner(System.in));
        //匿名对象作为返回值
        String next = b().next();

    }

    private static Scanner b() {
        return new Scanner(System.in);
    }
    public static void a(Scanner in){
        String next = in.next();
        System.out.println("next = " + next);
    }
}
