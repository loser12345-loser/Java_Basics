package o_lambda_表达式;
//生产者类_继承Thread或实现Runnable接口_开启线程
public class e2_producer extends Thread{
    private e0_Clerk clerk;

    public e2_producer(e0_Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("厨师开始炒制菜品...");
        //生产
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //将产品交给服务员
            try {
                clerk.setProduct(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
