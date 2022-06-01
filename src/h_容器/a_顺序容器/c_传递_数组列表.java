package h_容器.a_顺序容器;


import java.util.ArrayList;
import java.util.Random;

/*
1.产生20个随机整数,存入 aa数组列表中
2.筛选出其中的偶数,存入 bb数组列表中
*/
public class c_传递_数组列表 {
    public static void main(String[] args)  {
        ArrayList<Integer> aa = new ArrayList<>();      //aa是一个地址值(堆栈中的)
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int num = random.nextInt(100)+1; //1-100
            aa.add(num);
        }
        ArrayList<Integer> even = findEven(aa);
        System.out.println("even = " + even);

    }

    //数组列表作为参数
    private static ArrayList<Integer> findEven(ArrayList<Integer> aa) {  //参数是一个值
        ArrayList<Integer> bb = new ArrayList<>();
        for (int i = 0; i < aa.size(); i++) {
            int num = aa.get(i);
            if (num%2==0) bb.add(num);
        }
        //数组列表作为返回值
        return bb;      //返回值也是一个值
    }


}
