package c_循环;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class c_判断是否输入回车 {
    public static void main(String[] args) throws IOException {
        System.out.print("输入：");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        do {
            str = bf.readLine();
            if (str.length() == 0) {
                // 如果输入的字符串为空，则说明只输入了一个回车
                System.out.println("输入的是回车！");
            } else {
                System.out.println("输入内容是：" + str);    }
        } while (str.length() != 0);
    }

}
