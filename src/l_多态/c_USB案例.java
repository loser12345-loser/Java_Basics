package l_多态;

public class c_USB案例 {
    public static void main(String[] args) {
    //1.创建一个电脑对象
        c1_Computer computer = new c1_Computer();
        computer.power_on();         //电脑开机
    //2.创建鼠标
        c0_USB mouse = new c2_Mouse();              //多态写法
        c2_Keyboard keyboard = new c2_Keyboard();   //一般写法

        //3.使用设备
        computer.use_device(mouse);
        computer.use_device(keyboard);

        computer.power_off();        //电脑关机
    }
}
