package f_函数;


import java.util.Scanner;

public class b_参数传过去的是什么 {
    //java 语言在调用函数时，永远只能传过去 “值”
    public static void swap(int a,int b) {
        int t=a;
        a=b;
        b=t;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=5;
        int b=6;
        swap(a,b);
        System.out.println("a="+a+", b="+b);  // a=5 b=6
        in.close();
    }
}
