package n_多线程;

public class a2_my_thread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("my_thread--"+i);
        }
    }
}
