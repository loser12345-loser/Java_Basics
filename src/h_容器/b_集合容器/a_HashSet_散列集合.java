package h_容器.b_集合容器;


import java.util.ArrayList;
import java.util.HashSet;

public class a_HashSet_散列集合 {
    public static void main(String[] args) {
    //1.数组列表 具有列表的性质(有序,可重复)
        ArrayList<String> a=new ArrayList<String>();
        a.add("first");
        a.add("second");
        a.add("three");
        a.add("first");   //元素可重复
        System.out.println(a);
    //2.散列集合 具有集合的性质(唯一,无序,确定)
        HashSet<String> b=new HashSet<String>();
        b.add("first");
        b.add("two");
        b.add("three");
        b.add("first");  //唯一性
        System.out.println(b);
    }

}

