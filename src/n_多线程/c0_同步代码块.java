package n_多线程;

import com.sun.org.apache.bcel.internal.generic.NEW;

/*
1.同步代码块
	1.synchronized 关键字可以用于方法中的某个区块中，表示只对这个区块的资源实行互斥访问；
	2.格式：synchronized(同步锁){
				需要同步操作的代码
			}
	3.注意事项：
			A.通过代码块中的锁对象，可以使用任意的对象
			B.必须保证多个线程使用的锁对象是同一个
			C.锁对象：把同步代码块做住，只让一个线程在同步代码块中执行
			D.没有锁对象,线程之间是独立的单线程
2.内部类方式创建的线程
    1.独立的单线程
    2.彼此线程之间,没有联系
    3.独立于主线程

			*/
public class c0_同步代码块 implements Runnable {
    int tickets=20;
    //创建一个锁对象
    Object object =new Object();

    @Override
    public void run() {
        while (true){
            synchronized (object){
                if (tickets>0){
                    System.out.println(Thread.currentThread().getName()+"正在卖第"+tickets+"张票！");
                    tickets--;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
    //通过代码块,解决安全问题
        c0_同步代码块 aa = new c0_同步代码块();
        Thread s1 = new Thread(aa);
        Thread s2= new Thread(aa);
        Thread s3 = new Thread(aa);
        s1.start();
        s2.start();
        s3.start();
    //内部类的方式创建的多线程,是独立运行的,不是多线程,是单独的线程
/*        new Thread(new c0_同步代码块(),"aa").start();
        new Thread(new c0_同步代码块(),"bb").start();
        new Thread(new c0_同步代码块(),"cc").start();

        for (int i = 0; i < 20; i++) {
            System.out.println("main->"+i);
        }*/
    }
}
