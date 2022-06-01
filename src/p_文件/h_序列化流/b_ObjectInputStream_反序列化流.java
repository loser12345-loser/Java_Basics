package p_文件.h_序列化流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
<1> ObjectInputStream ：对象的反序列化流 ——————>把对象从文件中读取出来
	1.java.io.ObjectOutputStream extends InputStream
	2.构造方法：
	ObjecInputStream(InputStream in) //创建读入指定OInputStream的ObjectInputStream
	参数：
		InputStream in ：字节输入流
	3.特有的成员方法：
		Object readObject()  ： 从 ObjectOutputStream 读取对象
	4.使用步骤：
		1.创建ObjectInputStream对象，构造方法中传递字节输出流
		2.使用ObjectInputStream对象中的方法readObject，读取保存在文件中的对象
		3.释放资源
		4.使用读取出来的对象打印
*/
public class b_ObjectInputStream_反序列化流 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("src/p_文件/h_序列化流/z_序列化1.txt");
    //1.创建ObjectInputStream_反序列化流_对象,构造方法中传递字节输入流
        ObjectInputStream ois = new ObjectInputStream(fileInputStream);
    //2.使用ObjectInputStream中的readObject()方法,读取文件中的对象数据
        while (fileInputStream.available()>0){  //fileInputStream.available()>0 判断文件中是否还有内容
            Object o = ois.readObject();
            Person p=(Person)o;
            System.out.println(p);
        }

    //3.释放资源
        ois.close();

    }
}
