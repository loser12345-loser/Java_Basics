package b_分支;


import java.util.Scanner;

public class a_switch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        boolean flag=true;
        while (flag) {
            //尽量使用字符对应,使用数字当输入为字符时会报错
            char a =in.next().charAt(0);
            switch(a) {
                case '1':System.out.println("the one!");break;
                case '2':System.out.println("the two!");break;
                case '3':System.out.println("the three!");break;
                default :System.out.println("the end!");
            }
        }
        in.close();


    }

}
