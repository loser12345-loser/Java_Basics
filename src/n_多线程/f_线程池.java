package n_多线程;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
1.线程池：一个容纳多个线程的容器，其中的线程可以反复使用，省去了频繁创建线程对象的操作，无需反复创建线程而消耗过多的资源
	0.容器——集合ArrayList，HashSet，LinkedList<Thread>,HashMap
	1.创建多个线程保存在一个集合容器中，当我们使用线程的时候就从中拿出来
	2.Thread t=list.remove(0);    //返回的是被移除的元素，（线程只能被一个任务使用）
	3.Thread t=linked.removeFirst;
	4.当我们使用完毕线程，需要归还给线程池   list.add(t)  linked.addLast(t);
2.线程池的优点
	1.降低资源消耗，减少了创建和销毁线程的次数，线程可重复使用，可执行多个任务
 	2.提高响应速度，当任务达到时，任务可以不需要等待，可立即执行
 	3.提高线程的客观理性，根据系统的承受能力，调整线程池中工作线程数目
3.线程池的使用
	1.Java.util.concurrent.Executor：线程池的工厂类，用来生产线程池
	2.Executors类中的静态方法：
			static ExecutorService newFixedThreadPool(int nThreads) 创建一个可重复使用的固定线程池
			参数：  int nThread ：创建线程池中包含的线程池数量
			返回值：ExecutorService接口，返回的是ExecutorService接口的实现类对象，我们可以使用ExecutorService接口接收（面向接口编程）
	3.Java.util.concurrent.ExecutorService：线程池接口
	 		用来从线程池中获取线程，调用start方法，执行线程任务——submit(Runnable task) 提交一个Runnable任务用于执行
	 		关闭/销毁线程池的方法——void shutdown();
	4.线程池的使用步骤：
			A.使用线程池的工厂类Executors 里边提供的静态方法 newFixedThreadPool生产一个指定线程数量的线程池
			B.创建一个类，实现Runnable接口，重写run()方法，设置线程任务
			C.调用ExecutorService中的方法submit，传递线程任务(实现类)，开启线程，执行run()方法
			D.调用ExecutorService中的方法shutdown销毁线程池(不建议执行)
*/
public class f_线程池 {
    public static void main(String[] args) {
    //1.获取一个线程
        ExecutorService executorService = Executors.newFixedThreadPool(2);
    //2.调用ExecutorService中的方法submit,传递线程任务(实现类),开启线程,执行run()方法
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"通过线程池,获取线程");
            }
        });
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"通过线程池,获取线程");
            }
        });
    //3.销毁线程池(ExecutorService中的方法shutdown)
        executorService.shutdown();
    //4.关闭后,不能在获取了,会报错
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "通过线程池,获取线程");
            }
        });
    }


}
