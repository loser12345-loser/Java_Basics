package n_多线程;


//简化代码      匿名内部类,实现多线程
public class a3_匿名内部类_实现多线程 {
    public static void main(String[] args) {
    //1.匿名内部类
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("这是通过_匿名内部类_实现的多线程");
            }
        };
    //2.调用Thead的start方法,开启多线程
        new Thread(r).start();

        //匿名对象+匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("这是匿名对象+匿名内部类_实现多线程");
            }
        }).start();
    }

}
