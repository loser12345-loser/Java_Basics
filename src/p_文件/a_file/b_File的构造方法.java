package p_文件.a_file;

import java.io.File;

/*
<1> 构造方法：
	1.File(String pathname) ： 通过将给定路径名，字符串转换为抽象路径名来创建一个新的File实例；
		参数：
			String pathname ：字符串的路径名称
			1.可以以文件结尾，也可以文件夹结尾
			2.可以是相对路径，也可以是绝对路径
			3.路径可以是存在的，也可是不存在的
			4.创建File对象，只是把字符串路径分装为File对象，不考虑路径的真假
	2.File(String parent,String child) :根据parent路径名，字符串和child路径名，字符串创建一个新的File实例；
		参数：把路径分成两部分
			String parent ：父路径
			String child  ：子路径
		好处：父路径和子路径，可以单独书写，使用起来非常灵活，父路径和子路径都可以变化
	3.File(File parent，String child) : 根据parent抽象路径名和child路径名，字符串创建一个新的File实例；
		参数：
			 File parent ：父路径
			 String child  ：子路径
		好处：父路径是File类型，可以使用File的方法对路径进行一些操作，再使用路径创建对象
*/
public class b_File的构造方法 {
    public static void main(String[] args) {
//1.File类的构造方法
    //1.File(String pathname)
        File f1 = new File("d:\\mysql\\mysql-8.0.23-wind64\\bin");
        System.out.println("f1 = " + f1);
        //相对路径
        File f2 = new File("a.txt");
        System.out.println("f2 = " + f2);
    //2.File(String parent,String child)
        File f3 = new File("c:\\", "a.txt");
        System.out.println("f3 = " + f3);
    //3.File(File parent，String child)
        File parent = new File("c:\\");
        File f4 = new File(parent.getName(), "hell.java");
        System.out.println("f4 = " + f4);
    }
}
