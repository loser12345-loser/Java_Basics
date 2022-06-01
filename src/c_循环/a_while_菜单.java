package c_循环;


import java.util.Scanner;

public class a_while_菜单 {
    public static void main(String[] args) {
        int blance=0;
        boolean flag=true;
        Scanner in=new Scanner(System.in);
        while(flag){
            System.out.print("请投入金额：");
            int amount=in.nextInt();
            blance=amount+blance;
            if(blance>=10) {
                System.out.println("********************");
                System.out.println("*java城际公交专线****");
                System.out.println("**无指定座位票    ***");
                System.out.println("*票价 ：  10元    ***");
                System.out.println("********************");
                System.out.println("找零："+(blance-10));
                blance=blance-10;
            }
            else System.out.println("money is not enough!");
        }
        in.close();
    }
}
