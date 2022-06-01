package p_文件.a_file;

import java.io.File;

public class f2_文件的搜索 {
    public static void main(String[] args) {
    //1.获取文件(指文件路径)
        File file = new File("D:\\Java\\Java_Basics\\src\\p_文件\\a_file");
        getAllFile(file);
    }

    private static void getAllFile(File file) {
    //1.获取文件中的所有文件
        File[] files = file.listFiles();
        for (File f : files) {
            if(f.isDirectory()){
                getAllFile(f);
            }else {
                /* 只要以Java结尾的的文件
                 * 1.要把File对象f，转为字符串对象
                 *    String name=f.getName（）;
                 */
			/*	String s =f.getName();
				//调用String类中的方法endWith 判断字符串是否以Java结尾
				boolean b=s.contains(".java");

				//打印文件
				if(b) {
					System .out.println(f);
				}	*/
                if(f.getName().toLowerCase().endsWith("java")){
                    System.out.println(f);
                }
            }

        }
    }
}
