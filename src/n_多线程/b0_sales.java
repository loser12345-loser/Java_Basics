package n_多线程;

public class b0_sales implements Runnable{
    private int tickets=50;

    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName()+"正在卖第"+tickets+"张票!");
            tickets--;
            if (tickets==0) break;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        //出现卖重复票的安全问题
        new Thread(new b0_sales(),"aa").start();
        new Thread(new b0_sales(),"bb").start();
        new Thread(new b0_sales(),"cc").start();
    }
}
