package g_类和对象;
/*
1.static 静态资源
    1.静态变量  :属于类的变量(所有对象共享)
        1.访问    :类名.变量 或 对象名.变量
    2.静态方法  :属于类的
        2.访问    :类名.方法 或 对象名.方法
    3.静态方法只能访问静态变量,成员方法可以访问静态变量
        1.因为: 在加载类的时候,先加载静态,然后加载动态
        2.静态方法不能使用 this
    3.静态代码块
        1.特点: 当第一次用到本类时,静态代码块执行唯一一次
        2.静态代码块,比构造方法先执行
        3.用途: 一次性加载资源
    */
public class c_static关键字 {
//1.静态变量  :属于类的变量(所有对象共享)
    private static String room;
    static String sex="boy";
    private String name;
    private int age;

//2.静态方法
    public static void static_method(){
        System.out.println("这是一个静态方法!");
    }
    //成员方法
    public void member_method(){
        System.out.println("这是一个成员方法!");
    }
//3.静态代码块
    static{
    System.out.println("这是静态代码块!");
}




    public static String getRoom() {
        return room;
    }

    public static void setRoom(String room) {
        c_static关键字.room = room;
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

    public c_static关键字(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public c_static关键字() {
    }

    @Override
    public String toString() {
        return "c_static关键字{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
