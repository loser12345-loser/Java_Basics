package p_文件.h_序列化流;

import java.io.*;

/*
<1> 序列化概述：
	1.java提供了一种对象序列化机制，用一个字节序列可以表示一个对象
	2.该字节序列：包含该对象的数据，对象的类型，和对象中存储的属性等信息
	3.字节序列写到文件之后，相当于文件中持久保存了一个对象的信息。
<2> ObjectOutputStream ：对象的序列化流 ——————>把对象以流的方式写入到文件中
	1.java.io.ObjectOutputStream extends OutputStream
	2.构造方法：
		ObjectOutputStream(OutputStream out) //创建写入指定OutputStream的ObjectOutputStream
		参数：
			OutputStream out ：字节输出流
	3.特有的成员方法：
		void writeObject(Object obj)  ： 将指定的对象写入 ObjectOutputStream
	4.使用步骤：
		1.创建ObjectOutputStream对象，构造方法中传递字节输出流
		2.使用ObjectOutputStream对象中的方法writeObject，把对象写到文件中
		3.释放资源
	*/
public class a_ObjectOutputStream_序列化流 {
    public static void main(String[] args) throws IOException {
    //1.创建ObjectOutputStream_序列化输出流对象,构造方法中传递字节输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/p_文件/h_序列化流/z_序列化1.txt"));
    //2.使用ObjectOutputStream中的方法writeObject,把对象写到文件中
        oos.writeObject(new Person("xiaoxiao",23));
        oos.writeObject(new Person("dada",33));
        oos.writeObject(new Person("中中",63));
        //3.释放资源
        oos.close();

    }
}
