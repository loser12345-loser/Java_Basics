package n_多线程;

public class a0_单线程的说明 {
    private String name;

    public a0_单线程的说明(String name) {
        this.name = name;
    }

    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(name + "-->" + i);
        }
    }

    public static void main(String[] args) {
        a0_单线程的说明 aa = new a0_单线程的说明("aa");
        aa.run();
        //1.主线程缺点:  代码错误,整个进程都将停止
        System.out.println(0 / 0);
        a0_单线程的说明 bb = new a0_单线程的说明("bb");
        bb.run();
    }
}
