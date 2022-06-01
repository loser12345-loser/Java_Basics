package c_循环;


import java.util.Scanner;

public class b_while循环_算平均数 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);  //等待键盘输入
        String input= in.nextLine();  //读入一行的数据,作为手动读入的数据
        Scanner s = new Scanner(input);     //手动读入,全部读入,一个一个输出
        double sum=0;
        int count=0;
        while(s.hasNextInt()){      //判断是否还有int类型的数据,如果是in.hasNextInt()为判断输入的数据是否是int
            sum=sum+s.nextInt();
            count++;
        }
        if(count>0){
            System.out.println("平均数：="+sum/count);
        }
        in.close();
        s.close();
    }
}
