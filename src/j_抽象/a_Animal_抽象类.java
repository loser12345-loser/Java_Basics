package j_抽象;
/*
1.抽象类   abstract
    1.抽象方法: public abstract 返回值 方法名();
    2.抽象类:   public abstract class 类名{}
        1.抽象方法所在的类,必须是抽象类
    3.抽象类类和抽象方法的使用
        1.不能直接创建抽象类对象,必须用一个子类来继承抽象父类
        2.子类必须-覆盖重写-父类的抽象方法,或者成为一个抽象类
        3.抽象类中,可以有构造方法,是供子类创建对象时,初始化父类属性使用的
       */
//2.抽象类:   public abstract class 类名{}
public abstract class a_Animal_抽象类 {

//1.抽象方法: public abstract 返回值 方法名();
    public abstract void eat();

    //普通成员方法
    public void normal_method(){

    }

//3.抽象类中,可以有构造方法,是供子类创建对象时,初始化父类属性使用的
    public a_Animal_抽象类() {
    }
}
