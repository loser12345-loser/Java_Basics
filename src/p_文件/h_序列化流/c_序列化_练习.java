package p_文件.h_序列化流;

import java.io.*;
import java.util.ArrayList;

/*
<1> 练习：序列化集合
	1.当我们想在文件中保存多个对象文件的时候，可以把多个对象存储到一个集合中，对集合进行序列化和反序列化
	2.分析：
		1.定义一个存储Person对象的ArrayList集合
		2.往ArrayList集合中存储Person对象
		3.创建一个序列化流ObjectOutputStream对象
		4.使用ObjectOutputStream对象中的writeObject，对集合进行序列化
		5.创建一个反序列化ObjectOutputStream对象
		6.使用ObjectOutputStream对象中的方法 readObject 读取文件中保存的集合
		7.把Object类型的集合转换为ArrayList类型
		8.遍历ArrayList集合
		9.释放资源
*/
public class c_序列化_练习 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
    //1.创建一个ArrayList,存储Person对象
        ArrayList<Person> list = new ArrayList<Person>();
    //2.添加对象数据
        list.add(new Person("dog", 11));
        list.add(new Person("mao", 4));
        list.add(new Person("鸟", 7));
    //3.创建ObjectOutputStream_序列化对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/p_文件/h_序列化流/z_序列化2.txt"));
    //4.使用ObjectOutputStream中的writeObject()方法,对集合进行序列化
        oos.writeObject(list);

    //5.创建ObjectInputStream_反序列化对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/p_文件/h_序列化流/z_序列化2.txt"));
    //6.使用ObjectInputStream中的readObject()方法,读取文件的数据
        Object o = ois.readObject();
    //7.转换为person对象
        ArrayList<Person> list2 = (ArrayList<Person>) o;
        for (Person person : list2) {
            System.out.println(person);
        }

    //8.释放资源
        ois.close();
        oos.close();

    }
}
