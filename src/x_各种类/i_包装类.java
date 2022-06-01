package x_各种类;
/*
1.包装类  基本类型数据---->对象(引用类型)
    1.装箱    基本类型-->对应的包装类对象
        1.静态方法  valueOf(数字)     可以是int/string类型的数字
    2.拆箱    包装类对象--->对应的基本类型
        1.成员方法  intValue()
    3.自动装箱和拆箱
        1. Integer aa =1;
2.基本类型 <---->字符类型     xxx.valueOf()    xxx=对应的包装类型
    */
public class i_包装类 {
    public static void main(String[] args) {
    //1.装箱    基本类型-->对应的包装类对象
        //1.静态方法  valueOf(数字)     可以是int/string类型的数字
        Integer aa = Integer.valueOf(1);     System.out.println("aa = " + aa);
        System.out.println("Integer.valueOf(\"12\") = " + Integer.valueOf("12"));
    //2.拆箱    包装类对象--->对应的基本类型
        //1.成员方法  intValue()
        int bb = aa.intValue();     System.out.println("bb = " + bb);
    }
}
