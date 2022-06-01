package m_异常;

import java.util.Scanner;

//捕获异常
public class a_try_catch_finally {
    public static void main(String[] args) {
        int[] a=new int[10];
        int index;
        Scanner in=new Scanner(System.in);
        index=in.nextInt();
        try {
            //逻辑代码,可能会有异常的代码块
            a[index]=10;
            System.out.println("hello");
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("caught");
            //异常的原因
            System.out.println("e.getMessage() = " + e.getMessage());
            //异常原因和类型
            System.out.println("e = " + e);
            //异常原因和类型和位置
            e.printStackTrace();
        }finally {
            //一般用于资源的释放
            in.close();
            System.out.println("这是无论是否有异常,都要执行的语句");
        }

    }
}
