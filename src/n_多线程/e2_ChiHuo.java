package n_多线程;
/*
<1> 消费者（吃货类）：是一个线程类，可以继承Thread
	1.设置线程任务(run):吃包子
	2.对包子的的状态进行判断：
			false：没有包子，吃货调用wait()方法进入等待状态
			true ：有包子，吃货吃包子；
					修改包子的状态为false
					吃货唤醒包子线程，生产包子
 */
public class e2_ChiHuo extends Thread{
//1.创建包子变量
    private e0_BaoZi bz;

//2.添加构造方法_为包子赋值
    public e2_ChiHuo(e0_BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
    //3.循环吃包子
        while (true){
        //4.使用同步锁_让生产和吃货线程_只有一个在进行
            synchronized (bz){
            //5.对包子转态进行判断
                if (bz.isFlag()==false){
                //6.没有包子,吃货线程等待
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            //7.被唤醒后_执行的代码_吃包子
                System.out.println("吃货正在吃包子："+bz.getPi()+bz.getXian()+"的包子");
            //8.吃完包子_修改包子状态
                bz.setFlag(false);
            //9.唤醒包子铺_生产包子
                bz.notify();

                System.out.println("吃货已经把"+bz.getPi()+bz.getXian()+"包子，吃完了");
                System.out.println("包子铺开始生产包子……");
                System.out.println("-----------------------------------------------");
            }

        }
    }
}
