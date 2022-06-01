package k_接口;
/*
1.接口的方法
    1.default 默认方法(8)
        1.格式    public default 返回值 方法名(){方法体}
        2.作用    解决接口的升级
    2.static 静态方法(8)
        1.格式    public static 返回值 方法名(){方法体}
        2.使用    类名.方法名
    3.私有方法(9)
        2.作用    抽取公共方法,解决两个方法之间代码重复的问题
    4.常量的定义
        1.格式    public static final
    */
public interface a0_接口的方法的定义 {
    //抽象方法
    public abstract void method1();
    public abstract void method2();
    //如果添加一个新方法,实现类就会报错.(解决: 将方法编程默认方法即可)
//    public abstract void method3();
    public default void method3(){      //默认方法的定义
        System.out.println("这是新添加的默认方法");
    }
    //静态方法
    public static void method4(){
        System.out.println("这是接口的静态方法");
    }

    //常量
    public static final int num=10;
}
