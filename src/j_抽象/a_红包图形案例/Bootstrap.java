package j_抽象.a_红包图形案例;

public class Bootstrap {
    public static void main(String[] args) {
        //设置标题
        MyRed aa = new MyRed("xiao,发红包");
        //设置群主
        aa.setOwnerName("xiaoxiao");
        //普通红包
//        aa.setOpenWay(new NormalMode());
        //随机红包
        aa.setOpenWay(new RandomMode());

    }
}
