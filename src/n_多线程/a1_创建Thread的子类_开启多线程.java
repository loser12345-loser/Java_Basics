package n_多线程;
/*
1.开启多线程
	1.创建一个类继承至Thread类
	2.重写Thread类从Runnable继承来的run()方法
	3.创建Thread子类的对象
	4.调用Thread类中的start()方法，开启线程，执行run()方法
		void start()是该线程开始执行；Java虚拟机调用该线程的run()方法；
		结果是两个线程并发的运行；
		多次启动一个线程是非法的，特别是当线程已经结束执行后，不能再重新启动；
	Java程序属于抢占式调度；
    */
public class a1_创建Thread的子类_开启多线程 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread-->" + i);
        }
    }

    public static void main(String[] args) {
        //调用Thread类中的start()方法，开启线程
        a1_创建Thread的子类_开启多线程 thread1 = new a1_创建Thread的子类_开启多线程();
        thread1.start();
        //main 线程中
        for (int i = 0; i < 5; i++) {
            System.out.println("main-->" + i);
        }
    }
}
