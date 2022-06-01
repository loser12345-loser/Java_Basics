package h_容器.e_Map_接口;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.HashMap;
import java.util.Map;

/*
1.HashMap       存储自定义类型键值对
    1.key 唯一    需要重写hashCode()和equals()方法,保证key唯一
    2.基本类型,已经重写了hasCode()和equals()方法,相同键对应的值,新的覆盖旧的,并返回旧的值
    3.为了保证 key 唯一,需要重写hashCode()和equals()方法
    */
public class c_HashMap_存储自定义类型键值 {
    public static void main(String[] args) {
    //1.基本类型,已经重写了hasCode()和equals()方法,相同键对应的值,新的覆盖旧的,并返回旧的值
        Map<String, c0_person> map = new HashMap<>();
        map.put("北京",new c0_person("aa",12));
        c0_person replaced = map.put("北京", new c0_person("bb", 13));
        System.out.println("replaced = " + replaced);
        map.put("上海",new c0_person("cc",23));
        System.out.println("map = " + map);
    //2.为了保证 key 唯一,需要重写hashCode()和equals()方法
        Map<c0_person, String> my_map = new HashMap<>();
        my_map.put(new c0_person("aa",12),"北京");
        my_map.put(new c0_person("aa",12),"上海");
        my_map.put(new c0_person("bb",14),"广东");
        System.out.println("my_map = " + my_map);
    }
    
}
