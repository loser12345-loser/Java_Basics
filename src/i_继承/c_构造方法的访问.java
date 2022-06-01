package i_继承;
/*
1.继承中,父,子类构造方法的特点
    1.先执行父类的构造方法,后执行子类的构造方法
    2.子类构造方法中,有一个默认的 super();无惨的构造方法的调用
        1.可以通过 super关键字,调用父类的有参构造方法
        2.super必须是第一语句

    */
public class c_构造方法的访问 {
    public static void main(String[] args) {
        c1_子类1 aa = new c1_子类1();

    }
}
