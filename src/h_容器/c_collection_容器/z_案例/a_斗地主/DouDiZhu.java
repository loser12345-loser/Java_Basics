package h_容器.c_collection_容器.z_案例.a_斗地主;

import java.util.ArrayList;
import java.util.Collections;

/*
1.斗地主综合案例
    1.准备牌
    2.洗牌
    3.发牌
    4.看牌
    */
public class DouDiZhu {
    public static void main(String[] args) {
    //1.准备牌
        //1.定义一个列表,存储54张牌
        ArrayList<String> poker = new ArrayList<>();
        //2.定义两个数组, 一个存储牌的序号, 一个存储牌的花色
        String[] colors = {"♦", "♥", "♣", "♠"};
        String[] nums = {"2","3","4", "5","6", "7", "8","9", "10", "J","Q",  "K", "A",};
        //3.把大王和小王存储到poker中
        poker.add("大王");
        poker.add("小王");
        //循环遍历,组装52张牌
        for (String num : nums) {
            for (String color : colors) {
                //把组装好的牌,放入poker中
                //System.out.print(color+num+" ");
                poker.add(color+num);

            }
        }
    //2.洗牌
        Collections.shuffle(poker);
        System.out.println(poker);
    //3.发牌
        //1.定义4个列表,存储玩家手中的牌和底牌
        ArrayList<String> aa = new ArrayList<>();
        ArrayList<String> bb = new ArrayList<>();
        ArrayList<String> cc = new ArrayList<>();
        ArrayList<String> rest = new ArrayList<>();
        for (int i = 0; i < poker.size(); i++) {
            //2.获取每张牌
            String p = poker.get(i);
            //3.轮流发牌
            if (i<51){
                if (i%3==0) aa.add(p);
                if (i%2==0) bb.add(p);
                if (i%1==0) cc.add(p);
            }else {
                rest.add(p);
            }
        }
    //4.看牌
        System.out.println("aa = " + aa);
        System.out.println("bb = " + bb);
        System.out.println("cc = " + cc);
        System.out.println("rest = " + rest);

    }
}
