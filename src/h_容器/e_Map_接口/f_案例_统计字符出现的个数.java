package h_容器.e_Map_接口;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
1.统计字符出现的次数
    1.获取字符串数组
    2.统计出现次数
    */
public class f_案例_统计字符出现的个数 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入一个字符串:");
        String s = in.nextLine();
        String[] split = s.split("");
        System.out.println("split = " + Arrays.toString(split));
        //
        Map<String, Integer> map = new HashMap<>();
        for (String s1 : split) {
            if(map.containsKey(s1)){
                int  i = map.get(s1);
                map.put(s1,++i);
            }else {
                if(s1!=null&&!" ".equals(s1)){
                    map.put(s1,1);
                }

            }
        }
        System.out.println("map = " + map);
    }
}
