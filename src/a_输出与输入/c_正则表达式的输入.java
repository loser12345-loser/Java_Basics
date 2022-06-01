package a_输出与输入;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class c_正则表达式的输入 {
    public static void main(String[] args) throws FileNotFoundException {
        String input = "1 fish 2 fish red fish blue fish";
        Scanner in = new Scanner(input).useDelimiter("\\s*fish\\s*");
        System.out.println(in.nextInt());
        System.out.println(in.nextInt());
        System.out.println(in.next());
        System.out.println(in.next());
        in.close();
    }
}
