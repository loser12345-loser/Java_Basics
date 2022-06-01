package n_多线程;
/*
1.同步方法：
	1.使用synchronized修饰的方法，就叫同步方法，保证A线程执行该方法的时候，其他线程只能在方法外等着
		格式：public synchronized void method（）{
					可能会产生线程安全问题的代码
		      }
	2.步骤：
		A.定义一个同步方法                      //也可以定义静态方法  锁对象不是 this
		B.同步方法会把方法内部的代码锁住
		C.只让一个线程执行
		D.锁对象——this     */
public class c1_同步方法 implements Runnable{
    int tickets=20;

    //1.定义一个同步方法
    public synchronized void sale_tickets(){
        //2.同步方法,会把方法内部的代码锁住(只允许一个线性,访问或修改变量)
        if (tickets>0){
            System.out.println(Thread.currentThread().getName()+"正在卖第"+tickets+"张票！");
            tickets--;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    @Override
    public void run() {
        while (true){
            if(this.tickets<1) break;
            //3.让一个线程执行
            sale_tickets();
        }
    }

    public static void main(String[] args) {
        //通过同步方法,解决安全问题
        c1_同步方法 aa = new c1_同步方法();
        Thread s1 = new Thread(aa);
        Thread s2= new Thread(aa);
        Thread s3 = new Thread(aa);
        s1.start();
        s2.start();
        s3.start();
    }
}
