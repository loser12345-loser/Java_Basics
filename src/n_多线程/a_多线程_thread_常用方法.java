package n_多线程;
/*
1.Thread类的常用方法
    1.getName()---获取线程名称
    2.Thread.currentThread()    返回当前执行的线程对象引用
    */
public class a_多线程_thread_常用方法 extends Thread {
    @Override
    public void run() {
    //1.getName()---获取线程名称
        System.out.println("getName() = " + getName());
    //2.Thread.currentThread()    返回当前执行的线程对象引用
        Thread t1 = Thread.currentThread();
        System.out.println("Thread.currentThread() = " + t1);
        System.out.println("t1.getName() = " + t1.getName());
        System.out.println("Thread.currentThread() = " + Thread.currentThread());
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        //创建Thread的子类
        a_多线程_thread_常用方法 aa = new a_多线程_thread_常用方法();
        //调用start()方法,开启线程
        aa.start();
        //匿名对象调用
        new a_多线程_thread_常用方法().start();
        new a_多线程_thread_常用方法().start();

        //模拟秒表
        for (int i = 0; i < 10; i++) {
            System.out.print(i+" ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
