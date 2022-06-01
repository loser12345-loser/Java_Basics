package p_文件.f_字符缓冲流;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class b_BufferedReader_字符缓冲_输入流 {
    public static void main(String[] args) throws IOException {
    //1.创建字符缓冲_输入流---字符流(FileReader)
        BufferedReader br = new BufferedReader(new FileReader("src/p_文件/f_字符缓冲流/z_BufferedWriter.txt"));
    //2.使用字符缓冲_输入流中的方法read()/readLine()读取文本
        String line=null;
        String s = br.readLine();
        while ((line = br.readLine())!=null){
            System.out.println(line);
        }
    //3.释放资源
        br.close();
    }
}
