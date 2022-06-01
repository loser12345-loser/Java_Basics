package l_多态;

public class c1_Computer {

    public void power_on(){
        System.out.println("电脑开机...");
    }
    public void power_off(){
        System.out.println("电脑关机...");
    }
    //使用USB设备的方法,使用接口作为方法的参数
    public void use_device(c0_USB usb){
        usb.open();     //打开设备
        if(usb instanceof c2_Mouse){
            ((c2_Mouse) usb).click();
        }
        if(usb instanceof c2_Keyboard){
            ((c2_Keyboard) usb).input();
        }
        usb.close();    //关闭设备
    }

}
