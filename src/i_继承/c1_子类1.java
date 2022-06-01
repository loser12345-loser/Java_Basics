package i_继承;

public class c1_子类1 extends c0_父类{

    public c1_子类1() {
        //super();    //默认存在的,不写也有
        super(12); //通过super调用父类有参构造方法
        System.out.println("这是子类的-无参-构造方法...");
    }
}
