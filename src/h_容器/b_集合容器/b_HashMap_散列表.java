package h_容器.b_集合容器;

import java.util.HashMap;
import java.util.Scanner;

public class b_HashMap_散列表 {
    private final HashMap<Integer,String> coin_name=new HashMap<Integer,String>();
    public b_HashMap_散列表() {
        coin_name.put(1, "penny");
        coin_name.put(10,"dime");
        coin_name.put(25,"quatter");
        coin_name.put(50,"half-dola");
        coin_name.put(50, "五毛");
        //输出HashMap的大小
        System.out.println(coin_name.keySet().size());
        //输出HashMap的全部内容
        System.out.println(coin_name);
        System.out.println("****************");
        // for-each循环遍历
        for(Integer k:coin_name.keySet()) {
            String s=coin_name.get(k);
            System.out.println(s);
        }
    }
    public String getName(int amount) {
        // HashMap 里是否存在 关键字 key
        if(coin_name.containsKey(amount)) {
            return coin_name.get(amount);
        }	else return "Not found";
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int amount=in.nextInt();
        b_HashMap_散列表 coin=new b_HashMap_散列表();
        String name=coin.getName(amount);
        System.out.println(name);
        in.close();
    }

}
