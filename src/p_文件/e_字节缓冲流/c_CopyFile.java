package p_文件.e_字节缓冲流;

import java.io.*;

public class c_CopyFile {
    public static void main(String[] args) throws IOException {
    //1.创建字节输入和输出流
        FileInputStream fis = new FileInputStream("src/p_文件/e_字节缓冲流/z_buffered.txt");
        FileOutputStream fos = new FileOutputStream("src/p_文件/e_字节缓冲流/z_copy.txt",true);
    //2.创建字节输入和输出_缓冲流
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
    //3.边读边写
        byte[] bytes = new byte[64];    //最小是64,或64的倍数
        int len=0;
        while ((len=bis.read(bytes))!=-1){
            bos.write(bytes);
        }

        bos.close();
        bis.close();
        fos.close();
        fis.close();
    }
}