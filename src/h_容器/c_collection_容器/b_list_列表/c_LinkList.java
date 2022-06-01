package h_容器.c_collection_容器.b_list_列表;

import java.util.LinkedList;

/*
1.LinkList  含首尾元素操作的方法
    1.addFirst(element)   在开始处,添加元素 =push()
    2.addLast(element)    在末尾处,添加元素 =add()

    3.getFirst()  获取首个元素
    4.getLast()   获取末尾的元素

    5.removeFirst()   删除首个元素    =pop()
    6.removeLast()    删除最后一个元素=pop
    */
public class c_LinkList {
    public static void main(String[] args) {
        LinkedList<Object> l_list = new LinkedList<>();
        l_list.add("aaa");        l_list.add("bbb");        l_list.add("ccc");
    //1.addFirst(element)   在开始处,添加元素
        l_list.addFirst("AAA");
    //2.addLast(element)    在末尾处,添加元素
        l_list.addLast("BBB");
        if(!l_list.isEmpty()){
    //3.getFirst()  获取首个元素
        System.out.println("l_list.getFirst() = " + l_list.getFirst());
    //4.getLast()   获取末尾的元素
        System.out.println("l_list.getLast() = " + l_list.getLast());
        }
    //5.removeFirst()   删除首个元素
        System.out.println("l_list.removeFirst() = " + l_list.removeFirst());
        System.out.println("l_list.pop() = " + l_list.pop());
    //6.removeLast()    删除最后一个元素
        System.out.println("l_list.removeLast() = " + l_list.removeLast());


        System.out.println("l_list = " + l_list);
    }
}
