package g_类和对象;

public class c0_static {
    public static void main(String[] args) {
        c_static关键字 aa = new c_static关键字("aa", 23);
    //1.访问和获取    :对象名.变量 或 类名.变量
        //aa.setRoom("计算机1902");
        c_static关键字.setRoom("计算机1902");     //推荐
        System.out.println("aa = " + aa+", 班级: "+c_static关键字.getRoom());    //通过类名获取
        c_static关键字 bb = new c_static关键字("bb", 24);
        System.out.println("bb = " + bb+", 班级: "+bb.getRoom());               //通过对象名获取
        //2.访问静态方法    :类名.方法 或 对象名.方法
        c_static关键字.static_method();    //通过 类名.方法名 访问      推荐
        c_static关键字 cc = new c_static关键字("cc", 45);
        cc.static_method();               //通过 对象名.方法名 访问    编译后为通过类名访问
        //普通方法的访问: 需要创建对象
        //c_static关键字.member_method(); 不能通过类名直接访问
        c_static关键字 dd = new c_static关键字("dd", 11);
        dd.member_method();
    }
}
