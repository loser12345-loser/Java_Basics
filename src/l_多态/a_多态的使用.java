package l_多态;
/*
1.代码当中体系多态: 父类引用指向子类对象
    1.格式:
        父类  对象名=new  子类()
        接口  对象名=new  实现类()
    2.成员变量的使用
        1.通过 getter/setter 访问
        2.在没有private修饰情况下, 对象.属性=父类属性

*/
public class a_多态的使用 {
    public static void main(String[] args) {
    //1.方法的访问
        //父类引用,指向子类对象
        a0_父类 aa=new a1_子类1();
        //访问方法(子类覆盖重写后,调用子类方法)
        aa.method();
        //访问父类,特有方法
        aa.a0();
    //2.成员变量的访问
        System.out.println(aa.num);         //aa是父类对象,所有num是父类对象的num
        System.out.println(aa.getNum());
    }
}
