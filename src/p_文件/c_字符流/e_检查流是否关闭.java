package p_文件.c_字符流;

import java.io.FileInputStream;
import java.io.IOException;

public class e_检查流是否关闭 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try(
            FileInputStream fis1 = new FileInputStream("src/p_文件/c_字符流/z_FileWriter.txt");) {
            fis=fis1;
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fis.read();
            } catch (IOException e) {
                e.printStackTrace();    //如果流已经关闭,这里会报
            }
        }
    }
}
