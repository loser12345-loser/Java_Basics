package i_继承;
/*
1.super 关键字的三种用法
    1.在子类的成员方法中,访问父类的成员变量
    2.在子类的成员方法中,访问父类的成员方法
    3.在子类的成员方法中,访问父类的构造方法
    */
public class d1_徒弟1 extends d0_师傅 {
    private String d1_skill="z1_馒头配方";


    public void super_师傅属性(){
    //1.在子类的成员方法中,访问父类的成员变量
        System.out.println(super.getD0_skill());
    }
    @Override
    public void method(){
    //2.在子类的成员方法中,访问父类的成员方法
        super.method();
        System.out.println("这是父类的方法");
    }

    public d1_徒弟1(String d1_skill) {
    //3.在子类的成员方法中,访问父类的构造方法
        super("师傅");
        this.d1_skill = d1_skill;
    }

    public d1_徒弟1() {
    }




    public String getD1_skill() {
        return d1_skill;
    }

    public void setD1_skill(String d1_skill) {
        this.d1_skill = d1_skill;
    }
}
