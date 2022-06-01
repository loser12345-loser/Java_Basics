package h_容器.e_Map_接口;

import java.util.HashMap;
import java.util.Map;

/*
1.Map集合遍历键找值方式
    1.map.keySet()    返回所有键
    2.map.values()    返回所有值
    3. map.entrySet() 返回所有键值对
    */
public class b_Map_遍历 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("aa","xiaoxiao");
        map.put("bb","zhong");
        map.put("cc","da");
    //1.map.keySet()    返回所有键
        System.out.println("map.keySet() = " + map.keySet());
    //2.map.values()    返回所有值
        System.out.println("map.values() = " + map.values());
    //3. map.entrySet() 返回所有键值对
        System.out.println("map.entrySet() = " + map.entrySet());
        for (String s : map.keySet()) {
            System.out.println(s+"---"+map.get(s));
        }
    }

}
