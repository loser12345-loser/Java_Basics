package p_文件.a_file;

import java.io.File;

/*
<1> File类：遍历文件夹
	1.表示该File文件夹中的所有文件：public String[] list()     ：返回值为 String数组----文件名
	2.表示该File文件夹中的所有文件；public listFile()		   ：返回值一个File数组-----文件绝对路径+文件名
 */
public class f0_目录的遍历 {
    public static void main(String[] args) {
    //1.表示该File文件夹中的所有文件：public String[] list()  ：返回值为 String数组
        //文件夹1
        File f1 = new File("D:\\Java\\Java_Basics\\src\\p_文件");
        //文件夹2
        File f2= new File("D:\\Java\\Java_Basics\\src\\p_文件\\a_file");
        String[] list = f1.list();
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println();
        String[] list1 = f2.list();
        for (String s : list1) {
            System.out.println(s);
        }
        System.out.println();
    //2.表示该File文件夹中的所有文件；public listFile()		   ：返回值一个File数组
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
        System.out.println();
        File[] files1 = f2.listFiles();
        for (File file : files1) {
            System.out.println(file);
        }
    }
}
