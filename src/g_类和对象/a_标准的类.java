package g_类和对象;
/*
1.一个标准的类
    1.成员变量使用 private
    2.为每一个成员编写 getter和setter方法
    3.一个无参数构造方法
    4.一个全参数构造方法
    5.一个toString方法
这样的类也叫做: JavaBean(罗姐姐处理,组件,entityBean对应表的映射)
  */
public class a_标准的类 {
//1.private修饰成员变量
    private String name;
    private int age;
//2.每一个成员变量的getter和setter方法
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
//3.无惨构造方法
    public a_标准的类() {
    }
//4.全参构造方法
    public a_标准的类(String name, int age) {
        this.name = name;
        this.age = age;
    }
//5.tostring 方法

    @Override
    public String toString() {
        return "a_标准的类{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
