package h_容器.c_collection_容器.c_set_集合;
import h_容器.d_collections_集合工具类.a0_person;
/*
1.哈希表
    1.哈希值,16进制的逻辑地址
    2.哈希值的获取
        1.hashCode()    返回对象的哈希值
    3.覆盖重写hasCode方法
        1.字符串的toString方法已经重写了hasCode()方法
            1.相同字符串的hashCode相同
            2.hashCode相同的不同字符串    重地==通话
    */
public class a_哈希表 {
    public static void main(String[] args) {
        a0_person aa = new a0_person();
        System.out.println("aa.hashCode() = " + aa.hashCode());
        String s1 = new String("abc");
        String s2 = new String("abc");
        //相同字符串的hashCode相同
        System.out.println("s1.hashCode() = " + s1.hashCode());
        System.out.println("s2.hashCode() = " + s2.hashCode());
        //hashCode相同的不同字符串
        System.out.println("\"重地\".hashCode() = " + "重地".hashCode());
        System.out.println("\"通话\".hashCode() = " + "通话".hashCode());
    }
}
