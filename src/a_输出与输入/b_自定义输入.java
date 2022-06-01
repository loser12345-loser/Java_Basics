package a_输出与输入;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class b_自定义输入 {
    public static void main(String[] args) throws FileNotFoundException {
        String a="12 34 45";
        Scanner in = new Scanner(a);
        System.out.println(in.nextLine());
        in.close();

    }
}
