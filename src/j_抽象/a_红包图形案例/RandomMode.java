package j_抽象.a_红包图形案例;

import java.util.ArrayList;
import java.util.Random;

public class RandomMode implements OpenMode{
    @Override
    public ArrayList<Integer> divide(final int totalMoney,final int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        int rest_money=totalMoney;
        int rest_count=totalCount;
        for (int i = 0; i < totalCount-1; i++) {
            int money = random.nextInt(rest_money / rest_count * 2) + 1;
            list.add(money);
            rest_money-=money;
            rest_count--;
        }
        list.add(rest_money);
        return list;
    }
}
