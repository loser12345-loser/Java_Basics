package j_抽象;

import java.util.ArrayList;
import java.util.Random;

public class b2_c成员 extends b0_用户类{

    //收红包
    public void receive(ArrayList<Float> red_list){
    //1.抽取一个红包
        if(red_list.size()>0){
        int index = new Random().nextInt(red_list.size());
        Float money = red_list.remove(index);       //删除-数组列表-中的被抽取的红包,返回红包的金额
    //2.存到自己的余额中
        super.setRest(super.getRest()+money);
        }

    }


    public b2_c成员() {
    }

    public b2_c成员(String name, float rest) {
        super(name, rest);
    }
}
