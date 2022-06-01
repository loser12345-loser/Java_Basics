package a_输出与输入;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class d_从文件中读入 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("D:\\Java\\Java_Basics\\src\\a_变量与计算\\myNumbers"));
        while (in.hasNextLong()) {
            long aLong = in.nextLong();
            System.out.println(aLong);
        }

    }
}
