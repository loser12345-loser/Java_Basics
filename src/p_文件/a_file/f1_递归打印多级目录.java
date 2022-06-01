package p_文件.a_file;

import java.io.File;

public class f1_递归打印多级目录 {
    public static void main(String[] args) {
    //1.递归遍历文件夹
        File file = new File("D:\\Java\\Java_Basics\\src\\p_文件\\a_file");
        //递归方法
        getAllFile(file);
    }

    private static void getAllFile(File file) {
    //1.获取所有文件
        File[] files = file.listFiles();
        for (File f : files) {
        //2.判断是否是_文件夹
            if(f.isDirectory()){
            //3.是_是文件夹_递归遍历
                getAllFile(f);
            }else {
            //4.否_是文件_直接输出
                System.out.println(f);
            }
        }
    }
}
