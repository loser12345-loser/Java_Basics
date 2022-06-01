package p_文件.a_file;

import java.io.File;

/*
<1> java.io.File类
	1.文件和目录路径名的抽象表示形式。
	2.Java把电脑中的文件和文件夹（目录）封装为了一个File类，我们可以使用File类对文件和文件夹进行操作
	3.File类的方法：
		A.创建一个文件/文件夹
		B.删除一个文件/文件夹
		C.获取文件/文件夹
		D.判断文件/文件夹是否存在
		E.对文件夹进行遍历
		F.获取文件的大小
	4.File类是一个与系统无关的类，任何的操作系统都可以使用这个类中的方法
	5.三个关键词：
		file		：文件
		directory	：文件/目录
		path		：路径
	6.路径：
		1.路径不区分大小写
		2.路径中的文件名称分隔符，windows 使用反斜杠，反斜杠是转义字符，两个反斜杠代表一个普通的反斜杠
		3.如： D:\\mySQL\\mySql-8.0.23-winx64\\bin
 */
public class a_File_相关概念 {
/*
		static String pathSeparator 与系统有关的路径分隔符，为了方便，它被表示为一个字符串
		static char pathSeparatorChar	与系统有关的路径分隔符
		static String separator			与系统有关的默认名称分隔符，为了方便，它被表示为一个字符串
		static char separatorChar		与系统有关的默认名称分割符

		操作路径：路径不能写死了
		c:\develop\a\a.txt  	windows
		c:/develop/a/a.txt		linux
		"c:"+File.separator+"develop"+File.separator+"a"+File.separator+"a.txt"
*/
    public static void main(String[] args) {
    //1.路径分隔符  Windows_分号; Linux_冒号:
        String pathSeparator = File.pathSeparator;
        System.out.println("pathSeparator = " + pathSeparator);
    //2.文件名分隔符 Windows_反斜杠\  Linux_正斜杠 /
        String separator = File.separator;
        System.out.println("separator = " + separator);
    }
}



