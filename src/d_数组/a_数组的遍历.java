package d_数组;

import java.util.Scanner;

public class a_数组的遍历 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int[] data = new int[10];
        System.out.print("输入10个整数:");
        for (int i = 0; i < 10; i++) {
            data[i]=in.nextInt();
        }
        for (int i : data) {
            System.out.print(i+" ");
        }

    }
}
