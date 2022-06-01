package n_多线程;
/*
<1> 等待唤醒案例：线程之间的通信
	1.创建一个顾客线程 Customer：告诉老板要的包子的种类和数量，调用wait()方法，放弃CPU的执行，进入到无线等待状态 waiting
	2.创建一个老板线程 Boss	 ：花5秒钟做包子，做好之后，调用notify()方法，唤醒顾客吃包子
	3.注意事项：
			顾客和老板线程必须使用同步代码块包裹起来，保证等待和唤醒只能有一个在执行
			同步锁使用的对象必须唯一
			只有锁对象才能调用 wait()和 notify()方法
	Object类中的方法：
		void wait()   ——-在其他线程调用此对象的notify()方法或notifyAll()方法前，使当前线程等待
		void notify() ——-唤醒在此对象上等待的线程，继续执行wait()后的方法
<2> 调用wait()和notify()的注意事项
	1.wait()方法与notify()方法必须要由同一个锁对象调用。 因为是这个对象（管理者）在管理他的wait()和notify()方法，而
		其他管理者没有管理的权限；
	2.wait()方法和notify()方法都是Object的子类，Object是所有类的父类；所有锁对象可以是任意的对象
	3.wait()方法和notify()方法必须在同步代码块或者同步函数中使用，因为必须要通过锁对象调用这个方法
	4.wait(毫秒)=Thread.sleep(毫秒)
	5.notifyall() 唤醒所有线程
 */
public class d_线程状态 {


    public static void main(String[] args) {
        //创建多对象，保证唯一
        Object obj=new Object();

        //创建一个顾客线程
        new Thread() {
            @Override
            public void run() {
                //使用同步代码块
                synchronized(obj) {
                    System.out.println("老板，来一个包子！");
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //唤醒之后执行的代码
                    System.out.println("开始吃包子……");
                }
            }
        }.start();


        //创建一个老板线程
        new Thread() {
            @Override
            public void run() {
                synchronized(obj) {
                    //花5秒钟做包子
                    try {
                        System.out.println("正在做包子……");
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //保证等待和唤醒线程只有一个在执行
                    System.out .println("包子做好了！");
                    //调用notify方法，唤醒顾客吃包子
                    obj .notify();
                }
            }
        }.start();

    }
}
