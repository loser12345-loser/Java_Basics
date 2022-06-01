package n_多线程;


/*
<1> 测试类：
	1.创建包子对象
	2.创建包子铺线程，开启，生产包子；
	3.创建吃货线程，开启，吃包子；
*/
public class e3_Work {
    public static void main(String[] args) {
    //1.创建包子对象
        e0_BaoZi bz = new e0_BaoZi();
    //3.创建吃货线程_开始吃包子
        new e2_ChiHuo(bz).start();
    //2.创建包子铺线程_开始生产包子
        new e1_BaoZiPu(bz).start();


    }
}
