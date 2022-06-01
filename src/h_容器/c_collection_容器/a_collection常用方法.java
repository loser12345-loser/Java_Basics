package h_容器.c_collection_容器;
/*
1.collection常用方法
    1.boolean add(E e)      向容器中添加数据
    2.boolean remove(E e)   删除容器中的某个元素
    3.boolean contain(E e)  判断容器中是否包含某个元素
    4.boolean isEmpty()     判断容器是否为空
    5.int size()            获取容器元素的长度
    6.Object[] toArray()    把集合中的元素,存储到数组中
    7.void clear(E e)       清空容器中的元素
*/
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class a_collection常用方法{
    public static void main(String[] args) {
//        Collection collection=new ArrayList<String>();
        Collection collection=new HashSet<String>();
    //1.boolean add(E e)      向容器中添加数据
        collection.add("aa");
        collection.add("bb");
    //2.boolean remove(E e)   删除容器中的某个元素
        collection.remove("aa");
    //3.boolean contain(E e)  判断容器中是否包含某个元素
        System.out.println("collection.contains(\"bb\") = " + collection.contains("bb"));
    //4.boolean isEmpty()     判断容器是否为空
        System.out.println("collection.isEmpty() = " + collection.isEmpty());
    //5.int size()            获取容器元素的长度
        System.out.println("collection.size() = " + collection.size());
    //6.Object[] toArray()    把集合中的元素,存储到数组中
        Object[] objects = collection.toArray();
        System.out.println("Arrays.toString(objects) = " + Arrays.toString(objects));
    //7.void clear(E e)       清空容器中的元素
        collection.clear();

        System.out.println("collection = " + collection);
    }
}
