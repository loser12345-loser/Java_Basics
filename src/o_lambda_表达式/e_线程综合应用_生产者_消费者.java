package o_lambda_表达式;

public class e_线程综合应用_生产者_消费者 {
    public static void main(String[] args) {
        e0_Clerk clerk = new e0_Clerk();
        //生产者线程
        new e2_producer(clerk).start();
        //消费者线程
        new Thread(new e1_consumer(clerk)).start();
    }
}
