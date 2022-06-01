package o_lambda_表达式;
//消费者线程类_继承Thread或实现Runnable接口_开启线程
public class e1_consumer implements Runnable {
    private e0_Clerk clerk;

    public e1_consumer(e0_Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("吃货开吃...");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                clerk.getProduct();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
