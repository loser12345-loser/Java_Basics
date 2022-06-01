package n_多线程;
/*
<1> 实现Runnable接口开启线程
	1.创建一个Runnable接口的实现类
	2.在实现类中重写run()方法，设置线程任务
	3.创建一个Runnable接口的实现类对象
	4.创建Thread类对象，构造方法中传递Runnable接口的实现类
	5.调用Thread类中的Start方法，开启新的线程
 */
public class a2_实现Runnable接口_开启多线程 implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println("hello:"+i);
            if (i==3){
                System.out.println(5/0);
            }
            System.out.println("name:"+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
    //1.创建一个Runnable接口的实现
        a2_实现Runnable接口_开启多线程 aa = new a2_实现Runnable接口_开启多线程();
    //2.创建Thread类对象,构造方法中传入Runnable接口实现类对象
        new Thread(aa,"aa").start();
        //使用Runnable接口的好处，可以启动不同的线程
        new Thread(new a2_my_thread()).start();

        //main线程
        for(int i=0;i<5;i++) {
            System.out.println("main:"+i);
        }
    }
}
