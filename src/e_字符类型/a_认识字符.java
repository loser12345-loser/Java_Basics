package e_字符类型;

import java.util.Scanner;

public class a_认识字符 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        // 1. 简单的字符
        char c='a';     char c1='汉';
        System.out.println("c = " + c+ ", c1 = " + c1);
        // 2.字符的加减
        char a='A';
        System.out.println("a++= " + (++a));
        char a1='A';    char a2='D';
        System.out.println("(a2-a1) = " + (a2-a1));
        // 3.字符换算
        char a3=65;
        System.out.println("a3 = " + a3);
        System.out.println("int(a3) = " +( int)(a3));
        // 4.大小写转换
        char b0='a';     char b='A';
        char b1=(char)(b+'a'-'A');  //b加上小写与大写之间的距离
        char b2=(char)(b0+'A'-'a');
        System.out.println("b1="+b1);
        System.out.println("b2="+b2);
        System.out.println("Character.toUpperCase('a') = " + Character.toUpperCase('a'));
        System.out.println("Character.toLowerCase('A') = " + Character.toLowerCase('A'));
        in.close();
    }
}
