package p_文件.a_file;

import java.io.File;
import java.io.IOException;

/*
<1> File类：创建和删除文件夹
	1.创建一个文件：
			public boolean createNewFile()	:文件不存在时，创建一个新的文件
			A.创建文件的路径和名称在构造方法中给出(构造方法的参数)
			B.true ：文件不存在，创建文件
			  false：文件存在，不会创建
			C.只创建文件，不能创建文件夹
			D.创建文件的路径必须存在
	2.创建文件夹：
			A.创建单级文件夹：public boolean mkdir()				:创建file表示的文件
			  创建多极文件夹：public boolean mkdirs()			:创建一个文件/文件夹

	4.删除一个文件/文件夹：
	 		public boolean delete()				:删除一个文件/文件夹
 */
public class e_创建和删除文件夹 {
    public static void main(String[] args) throws IOException {
    //1.创建一个文件：public boolean createNewFile()	:文件不存在时，创建一个新的文件
        File f1=new File("D:\\Java\\Java's data\\1-7.文件\\src\\a1.txt");
        System.out.println("f1.createNewFile() = " + f1.createNewFile());
    //2.创建文件夹：
        //创建单级文件夹：public boolean mkdir()
        File f2=new File ("D:\\Java\\Java's data\\1-7.文件\\src\\aa");
        System.out.println("f2.mkdir() = " + f2.mkdir());
        //创建多极文件夹：public boolean mkdirs()
        File f3=new File ("D:\\Java\\Java's data\\1-7.文件\\src\\bb\\cc\\dd");
        System.out.println("f3.mkdirs() = " + f3.mkdirs());
    //3.删除一个文件/文件夹：public boolean delete()				:删除一个文件/文件夹(需为空)
        File f4=new	File ("D:\\json1.txt");
        System.out.println("f4.delete() = " + f4.delete());
        File f5 = new File("D:\\aa");
        System.out.println("f5.delete() = " + f5.delete());
    }
}
