package c_循环;


import java.util.Scanner;

public class d_do_while循环_数数 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int count=0;
        // 先做在判断,因为0不能做除数
        do{
            number/=10;
            count++;
        }while (number>0);
        System.out.println("count = " + count);
    }
}
