package i_继承;
/*
1.继承    子类继承父类的非私有属性和方法
    1.覆盖    :子父类的同名属性或方法,会被子类覆盖
        1.访问属性
            1.getter/setter 访问
            2.没有private修饰  对象名.属性 =对象的属性
        2.访问方法
            */

public class a_属性和方法 {
    public static void main(String[] args) {
        a1_徒弟 a1_徒弟 = new a1_徒弟();
        a2_徒弟 a2_徒弟 = new a2_徒弟();
    //1.访问属性
        //1.访问属性
        System.out.println("a1_徒弟.getCanB() = " + a1_徒弟.getCanB());
        System.out.println("a2_徒弟.getCanB() = " + a2_徒弟.getCanB());
        System.out.println("a1_徒弟.getCanC() = " + a1_徒弟.getCanC());
        System.out.println("a2_徒弟.getCanD() = " + a2_徒弟.getCanD()+"\n");
        //2.同名属性,子类覆盖父类
        System.out.println("a1_徒弟.getCanA() = " + a1_徒弟.getCanA());
        System.out.println("a2_徒弟.getCanA() = " + a2_徒弟.getCanA()+"\n");
        //3.属性没有被private修饰
        System.out.println(a1_徒弟.num);
        System.out.println(a2_徒弟.num);
    //2.访问方法
        //访问父类方法
        System.out.print("a1_徒弟,能做: "); a1_徒弟.can();
        System.out.print("a2_徒弟,能做: "); a2_徒弟.can();
        //访问同名方法: 覆盖
        a1_徒弟.print();
        a2_徒弟.print();
    }
}
