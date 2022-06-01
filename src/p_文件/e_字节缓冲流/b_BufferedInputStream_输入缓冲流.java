package p_文件.e_字节缓冲流;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class b_BufferedInputStream_输入缓冲流 {
    public static void main(String[] args) throws IOException {
    //1.获取当前毫秒值
        long s = System.currentTimeMillis();
    //2.获取字节输入流
        FileInputStream fis = new FileInputStream("src/p_文件/e_字节缓冲流/z_buffered.txt");
    //3.获取字节输入缓冲流
        BufferedInputStream bis = new BufferedInputStream(fis);
        byte[] bytes = new byte[24];
        int len = bis.read(bytes);
        System.out.println("new String(bytes) = " + new String(bytes));
        System.out.println(Arrays.toString(bytes));
        bis.close();
        fis.close();
    //4.计算耗时
        long e = System.currentTimeMillis();
        System.out.println("共耗时:"+(e-s));
    }
}
