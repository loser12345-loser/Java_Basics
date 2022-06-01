package g_类和对象;
/*
1.内部类
    1.成员内部类
        1.通过-外部类方法,访问内部类
        2.同过-内部类对象,访问内部类
        3.内部类 通过 -外部类名.this.属性名-  访问外部类属性和方法
    2.局部内部:   方法中的内
        1.通过-外部类方法(局部内部类所在的方法),访问内部类
        2.注意事项: 局部内部类访问方法的变量,该变量必须是 final的(因为方法的生命周期比类短)
    3.匿名内部类
        1.在创建的时候,只能使用一次
        2.有对象名,可以一次调用所有方法. 没有只能在末尾使用一次 ( .方法 )
        3.作用: 代码简写,不用编写实现类
    */
public class e_内部类的使用 {
    public static void main(String[] args) {
    //1.成员内部类
        //1.通过-外部类方法,访问内部类
        e0_成员内部类 aa = new e0_成员内部类();
        aa.outer();
        //2.同过-内部类对象,访问内部类
        e0_成员内部类.Inner inner = new e0_成员内部类().new Inner();
        inner.inner();
    //2.局部内部:   方法中的内
        //1.通过-外部类方法(局部内部类所在的方法),访问内部类
        e1_局部内部类 bb = new e1_局部内部类();
        bb.methodOuter();
    //3.匿名内部类
        //普通,可多次使用
        e2_匿名内部类 cc = new e3_实现类();
        cc.method();
        //1.只能使用一次
        e2_匿名内部类 dd = new e2_匿名内部类() {
            @Override
            public void method() {
                System.out.println("这是匿名内部类...");
            }

            @Override
            public void method1() {
                System.out.println("这是匿名内部类1111...");
            }
        };
        //调用匿名内部类方法
        dd.method();
        dd.method1();
        //没有对象名-的匿名内部类
        new e2_匿名内部类(){

            @Override
            public void method() {
                System.out.println("这是没有对象名,的匿名内部类...");
            }

            @Override
            public void method1() {

            }
        }.method();


    }
}
