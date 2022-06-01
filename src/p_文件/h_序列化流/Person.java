package p_文件.h_序列化流;

import java.io.Serializable;
import java.util.Objects;
/*
<1> static 关键字：
	1.静态优先于非静态加载到内存中
	2.静态只加载一次
	3.被static修饰的成员变量不能被序列化  ——————被transient修饰的也不能被序列化
<2> InvalidClassException
	1.当类发生改变是，序列化写入文件的对象在反序列化是会报，InvalidClassException
	2.原因是序列化时会写入一个序列化编号，类发生改变编号改变，反序列化是编号不一致，导致反序列化失败
	3.解决方法，固定序列化编号   static final long serialVersionUID=42L；
*/
//implements  Serializable  的作用是标记，其中并没有任何方法  没有实现会报 NotSerializableException异常
public class Person implements Comparable<Person>, Serializable {
    private static final long serialVersionUID=4L;
    private String name;
    private int age;     ////修改导致反序列化失败, 解决方法固定序列化编号

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Person o) {
        return this.age-o.age;
    }
}
