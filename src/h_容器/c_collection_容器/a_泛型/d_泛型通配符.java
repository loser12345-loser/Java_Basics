package h_容器.c_collection_容器.a_泛型;

import java.util.ArrayList;

/*
1.泛型通配符
    1.接收任意的数据类型参数
    2.使用方式
        1.不能创建对象使用
        2.只能作为方法的参数使用
    3.举例
        1.遍历任意数据类型的列表
        */
public class d_泛型通配符 {
    public static void main(String[] args) {
        ArrayList<Integer> aa = new ArrayList<>();
        aa.add(11);
        aa.add(22);
        print(aa);
        ArrayList<String> bb = new ArrayList<>();
        bb.add("aa");
        bb.add("bb");
        print(bb);
    }
    //1.遍历任意数据类型的列表
    public static  void print(ArrayList<?> list){
        for (Object o : list) {
            System.out.println(o);
        }

    }
}
