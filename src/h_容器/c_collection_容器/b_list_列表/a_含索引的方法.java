package h_容器.c_collection_容器.b_list_列表;

import java.util.ArrayList;
import java.util.List;

/*
1.list_列表   含索引的方法
    1.add(index element)  在指定位置添加元素
    2.remove(index)   删除指定索引的元素,并返回
    3.set(index,element)  覆盖指定索引的值
    4.get(index)  获取对应下标的值
    */
public class a_含索引的方法 {
    public static void main(String[] args) {
        //创建list接口实现类对象
        List list=new ArrayList();
        list.add("aaaa");
    //1.add(index element)  在指定位置添加元素
        list.add(0,"bbb");
    //2.remove(index)   删除指定索引的元素,并返回
        Object removed = list.remove(1);
        System.out.println("removed = " + removed);
    //3.set(index,element)  覆盖指定索引的值
        list.set(0,"aaa");
    //4.get(index)  获取对应下标的值
        Object got = list.get(0);
        System.out.println("got = " + got);


        System.out.println("list = " + list);
    }
}
