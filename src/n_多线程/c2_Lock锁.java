package n_多线程;

import com.sun.org.apache.bcel.internal.generic.NEW;
import sun.applet.Main;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
<1> Lock锁
	1.Java.util.concurrent.locks.Lock 机制提供了比synchronized代码块和synchronized方法更广泛的锁定操作
	  同步代码块/同步方法具有的功能Lock都有，除此之外更强大，更体现面向对象。
	2.Lock锁也称同步锁
		格式：
		    public void lock();     //加同步锁
		    public void unlock();   //释放同步锁
    3.使用步骤：
    		A.在成员位置创建一个 ReentrantLock 对象
    		B.在可能会出现问题的代码前，调用Lock接口重点方法——获取锁
    		C.在其后面调用Lock接口中的方法unlock——释放锁
 */
public class c2_Lock锁 implements Runnable{
    int tickets=10;
//1.在成员变量位置,创建一个 Reentranantlock
    Lock lock =new ReentrantLock();

    @Override
    public void run() {
        while (true){
        //2.在可能出现问题的代码前,调用Lock接口重点方法——获取锁
            lock.lock();
            if (tickets>0) {
                try {
                    Thread.sleep(100);
                    System.out.println(Thread.currentThread().getName()+"正在卖第"+tickets+"张票！");
                    tickets--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                //3.在其后面调用Lock接口中的方法unlock——释放锁
                    lock.unlock();
                }
            }else {
            //3.在其后面调用Lock接口中的方法unlock——释放锁
                lock.unlock();
                break;
            }

        }
    }

    public static void main(String[] args) {
        //通过lock锁,解决线程安全问题
        c2_Lock锁 r = new c2_Lock锁();
        Thread aa = new Thread(r, "a1");
        Thread bb = new Thread(r, "b2");
        Thread cc = new Thread(r, "c3");
        Thread dd = new Thread(r, "d4");
        //调用Thread的start方法开启线程
        aa.start();
        bb.start();
        cc.start();
    }
}