package x_各种类;


import java.util.Random;
/*
1.random 类
    1.产生随机数
    2.setSeed(种子)
        1,种子相同,产生的随机数相同
        */

public class b_random类 {
    public static void main(String[] args) {
    //1.Math.random()  [0.0,1 )  的随机数
        for (int i = 0; i < 20; i++) {
            System.out.print((int) (Math.random()*10+1)+" ");
        }
        System.out.println();
    //2.Random类产生随机数
        Random random = new Random();
        //产生该数据类型范围内的随机数
        System.out.println("random.nextInt() = " + random.nextInt());
        //产生指定范围内的随机数,[0,n)
        for (int i = 0; i < 20; i++) {
            System.out.print(random.nextInt(10)+" ");
        }
        System.out.println();
        //产生随机数的种子,种子相同,产生相同的数
        random.setSeed(50);
        System.out.println("random.nextInt(10) = " + random.nextInt(10));
        
    }
}
