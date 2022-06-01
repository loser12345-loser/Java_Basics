package h_容器.c_collection_容器.c_set_集合;

import java.util.HashSet;

/*
1.HashSet 存储自定义类型,需要覆盖重写hashCode()和equals()方法
    1.保证元素唯一性
    2.定义: 同名,同年龄的人视为同一个人
    */
public class b_HashSet {
    public static void main(String[] args) {
        HashSet<Object> aa = new HashSet<>();
        b0_person p1 = new b0_person("aa", 18);
        b0_person p2 = new b0_person("bb", 18);
        b0_person p3 = new b0_person("aa", 18);
        aa.add(p1);
        aa.add(p2);
        aa.add(p3);
        System.out.println("aa = " + aa);
    }
}
