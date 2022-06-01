package g_类和对象;
/*
1.final 关键值     固定的,不可修改的
    1.修饰类   不能有子类,不可被继承
        public final class{}
    2.修饰方法  最终方法,不可被覆盖重写
        public final 返回值 方法名(){}
    3.修饰成员变量    成员变量不可变(只可以赋值一次,手动直接赋值或构造方法)
    4.修饰局部变量    该变量的不可改变
    */
public class d_final关键字 {
    //成员变量手动直接赋值
    final String name="aaa";
    //成员变量使用构造方法赋值
    final String number;

    public d_final关键字() {
        this("12344");
    }

    public d_final关键字(String number) {
        this.number = number;
    }

    public static void main(String[] args) {
        d_final关键字 aa = new d_final关键字();
        System.out.println(aa.name);
        aa=new d_final关键字();

        final d_final关键字 bb = new d_final关键字();
        //地址值,不可变
//        bb=new d_final关键字();   报错,地址值为final不可变
    }
}
