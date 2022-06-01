package h_容器.c_collection_容器;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class b_iterator迭代器 {
    public static void main(String[] args) {
        Collection collection=new ArrayList<String >();
        collection.add("aa");
        collection.add("bb");
        collection.add("cc");

        //while 循环
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //推荐方法 for-each
        for (Object o : collection) {
            System.out.println(o);
        }

    }
}
