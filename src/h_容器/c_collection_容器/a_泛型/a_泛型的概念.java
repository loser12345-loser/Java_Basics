package h_容器.c_collection_容器.a_泛型;

import java.util.ArrayList;

/*
0.泛型
    1.方法是一个未知的数据类型,当不确定是什么类型是可以使用泛型
    2.泛型可以接收-任意类型的数据
    3.可以在传递参数的时候,确定泛型的类型
1.列表中-不适用泛型
    1.默认是 Object类型,可以存储-各种类型-的数据
    2.如果在使用时,注意类型. 父类不能调用子类方法,必须向下转型(instance of)
2.列表中-使用泛型
    1.元素类型一致,不用在一一判断,操作比较方法
    2.缺点,只能存储单个类型的数据
*/
public class a_泛型的概念 {
    public static void main(String[] args) {
    //1.列表中不适用泛型
        ArrayList list=new ArrayList<>();
        //1.默认是 Object类型,可以存储-各种类型-的数据
        list.add("aa");
        list.add(11);
        list.add(false);
        for (Object o : list) {
            System.out.println(o);
            //2.调用子类特有方法, 必须向下转型
            if(o instanceof String ){
                System.out.println("((String) o).length() = " + ((String) o).length());
            }
        }
    //2.列表中-使用泛型
        ArrayList<String> s_list = new ArrayList<>();
        //2.只能存储string类型的数据
        s_list.add("aaa");
        s_list.add("bbb");
        for (String s : s_list) {
            System.out.println(s);
        }

    }
}
