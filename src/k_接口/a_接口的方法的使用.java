package k_接口;


/*
1.接口的使用
    1.接口不能直接使用,必须要有实现类
    2.接口的实现类,必须覆盖重写所有的接口方法
    3.接口不能直接 new
    4.如果没有覆盖重写所有的方法,自己成为抽象类即可
    */
public interface a_接口的方法的使用 {
    public static void main(String[] args) {
        a0_接口的实现类 aa = new a0_接口的实现类();
    //1.使用接口的实现类的方法
        aa.method1();
        aa.method2();
    //2.使用接口默认的方法
        aa.method3();
    //3.使用接口实现类,实现默认的方法
        aa.method3();
    //4.使用接口的静态方法
        a0_接口的方法的定义.method4();
    //5.访问接口的常量
        System.out.println(a0_接口的方法的定义.num);
    }

}
