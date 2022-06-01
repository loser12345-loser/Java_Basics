package n_多线程;
/*
<1>	生产者-包子铺 类：是一个线程，可以继承Thread类
	1.设置线程任务（run）：生产包子
	2.对包子的状态进行判断：
			true：有包子————包子铺调用wait()方法进入等待
			false：没有包子——包子铺生产包子
					交替生产两种包子，生产好后，修改包子的状态true
					唤醒吃货线程，让吃货吃包子
	3.锁对象必须唯一：
			A.包子铺线程和包子线程关系->通信（互斥）
			B.必须使用同步技术——保证两个线程只有一个在执行
			C.锁对象必须唯一，可以使用包子对象作为锁对象
			D.包子铺类和吃货的类就必须报<包子对象作为参数传进来>
					1.需要在成员变量的位置创建一个包子变量
					2.使用带参数的构造方法，为这个包子变量赋值
 */
public class e1_BaoZiPu extends Thread{
//1.定义一个包子变量
    private e0_BaoZi bz;

//2.添加构造方法,为包子变量赋值
    public e1_BaoZiPu(e0_BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
//        int count=0;
    //3.循环生产包子
        while (true){
        //4.使用同步锁_保证只有一个线程在执行
            synchronized (bz){
            //5.多包子状态_进行判断
                if(bz.isFlag()==true){
                //6.包子铺_等待
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            //7.被唤醒后_生成包子
                bz.setPi("薄皮");
                bz.setXian("三鲜馅");
                System.out.println("包子铺_真正生成:" + bz.getPi() + bz.getXian() + "的包子...");
            //8.生产用时_2秒
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            //9.包子铺_生产完毕,
                bz.setFlag(true);
            //10.唤醒吃货线程_吃包子
                bz.notify();
                System.out.println("包子铺_生产完成:" + bz.getPi() + bz.getXian() + "的包子,可以享用了..");
            }
        }
    }
}
