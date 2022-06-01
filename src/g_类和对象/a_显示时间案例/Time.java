package g_类和对象.a_显示时间案例;
/*
这是显示时间的类:
    1.要显示: 时钟
    2.要显示: 分钟
    */
public class Time {
    // 小时
    private Show hour=new Show(24);
    // 分钟
    private Show minute=new Show(60);
    // 开始自增
    public void start(){
        while (true){
            minute.increase();
            if (minute.getValue()==0){
                hour.increase();
            }
            System.out.printf("%02d:%02d\n",hour.getValue(),minute.getValue());
        }
    }

    public static void main(String[] args) {
        Time showTime = new Time();
        // 启动程序
        showTime.start();
    }


}
