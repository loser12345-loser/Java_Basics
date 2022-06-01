package p_文件.a_file;

import java.io.File;

/*
<1> File判断功能的方法
	1.public boolean exist();       ：此File表示文件或目录是否存在,存在为true
	2.public boolean isDirectory(); ：此File是否为目录
	3.public boolean isFile();		：此File表示的是否为文件
 */
public class d_判断功能的方法 {
    public static void main(String[] args) {
    //1.public boolean exist();       ：此File表示文件或目录是否存在,存在为true
        File f1 = new File("D:\\Java\\Java's data\\1-7.文件");
        if(f1.exists()){
            System.out.println("f1.isDirectory() = " + f1.isDirectory());
            System.out.println("f1.isFile() = " + f1.isFile());
        }else {
            System.out.println("This file is not exists...");
        }
    }
}
