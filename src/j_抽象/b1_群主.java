package j_抽象;

import java.util.ArrayList;

public class b1_群主 extends b0_用户类 {

    //发红包
    public ArrayList<Float> send(int money,int count){
        ArrayList<Float> red_list = new ArrayList<>();    //存放红包的-数组列表
        if(money<=super.getRest()){                         //判断余额是否足够
        //1.发红包,平均拆分为count分
            float average=money/count;
            for (int i = 0; i < count; i++) {
                red_list.add(average);
            }
        //2.扣出金额,重新设置余额
            super.setRest(super.getRest()-money);
        }else {
            System.out.println("余额不足...");
            return red_list;
        }

        return red_list;
    }



    public b1_群主() {
    }

    public b1_群主(String name, float rest) {
        super(name, rest);
    }
}
