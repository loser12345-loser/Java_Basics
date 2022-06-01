package h_容器.e_Map_接口;

import java.util.HashMap;
import java.util.Map;

/*
1.Map_接口_常用方法
    1.put(K k,V v)   放键值对,没有返回null,有就替换,返回被替换的值
    2.remove(K k)    删除对应key的键值对,存在返回被删的键值对,不存在返回null
    3.get(K k)       返回键对应的值,存在返回被删的键值对,不存在返回null
    */
public class a_Map_接口_常用方法 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
    //1.put(K k,V v)  放键值对,没有返回null,有就替换,返回被替换的值
        String return_value = map.put("aa", "小小");
        System.out.println("return_value = " + return_value);
        String return_value1 = map.put("aa", "笑笑");
        System.out.println("return_value = " + return_value1);
    //2.remove(K k)    删除对应key的键值对,存在返回被删的键值对,不存在返回null
        String removed_value = map.remove("aa");
        System.out.println("removed_value = " + removed_value);
        System.out.println("map.remove(\"aa\") = " + map.remove("aa"));
    //3.get(K k)       返回键对应的值
        map.put("bb","比比");
        System.out.println("map.get(\"bb\") = " + map.get("bb"));
    //4.containsKey(K k)    判断是否包含指定的key
        System.out.println("map.containsKey(\"bb\") = " + map.containsKey("bb"));
    //5.containsValue(K k)  判断是否包含对应的value
        System.out.println("map.containsValue(\"比比\") = " + map.containsValue("比比"));
        System.out.println("map = " + map);
    }
}
