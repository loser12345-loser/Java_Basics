package a_输出与输入;

import java.util.Scanner;

public class a_输入与输出 {
    public static void main(String[] args) {
    //1.输出
        //print: 直接输出
        System.out.print("print--直接输出六种数据");
        //printf: 按格式输出
        int b=23; double a=1.2343421;
        System.out.printf("\n\t%d\n",b);
        System.out.printf("%.2f\n",a);
        //println: 换行输出六种数据
        System.out.println("println--换行输出");
    //2.输入
        System.out.println("2.输入----------------------------------------");
        while (true) {
            Scanner in = new Scanner(System.in);
            try{
                int i= in.nextInt();
                System.out.println("i = " + i);
                in.close();
                break;
            } catch (Exception exception) {
                System.out.println("请输入整数!");
            }

        }

/*        while (true) {
            Scanner in = new Scanner(System.in);
            if (in.hasNextInt()){
                int i = in.nextInt();
                System.out.println("i = " + i);
                in.close()
                break;
            }else {
                System.out.println("请输入整数");
            }
        }*/

    }
}
