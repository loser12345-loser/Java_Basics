package p_文件.a_file;

import java.io.File;

/*
<1>File类获取功能的方法
	1.public String getAbsolutePath(); :返回File的绝对路径
	2.public String getPath();		   ：将路径传化为字符串
	3.public String getName();		   ：返回由此File表示的文件或目录名称
	4.public long   Length();		   ：返回由此File表示的文件夹的长度，文件夹没有大小之说
 */
public class c_File常用的获取方法 {
    public static void main(String[] args) {
    //1.public String getAbsolutePath(); :返回File的绝对路径
        File f1 = new File("D:\\Java\\Java's data\\1-7.文件\\a.txt");
        System.out.println("f1.getAbsolutePath() = " + f1.getAbsolutePath());
        //相对路径
        File f2 = new File("a1.txt");
        System.out.println("f2.getAbsolutePath() = " + f2.getAbsolutePath());
    //2.public String getPath();		   ：将路径传化为字符串
        File f3 = new File("D:\\Java\\Java's data\\1-7.文件\\a2.txt");
        File f4 = new File("a2.txt");
        System.out.println("f3.getPath() = " + f3.getPath());
        System.out.println("f4.getPath() = " + f4.getPath());
    //3.public String getName();		   ：返回由此File表示的文件或目录名称
        System.out.println("f3.getName() = " + f3.getName());
        System.out.println("f4.getName() = " + f4.getName());
    //4.public long   Length();		   ：返回由此File表示的文件夹的长度，文件夹没有大小之说
        System.out.println("f3.length() = " + f3.length());
        System.out.println("f4.length() = " + f4.length());
    }
}
