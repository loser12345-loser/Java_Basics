package g_类和对象.a_显示时间案例;
/*
这是显示时间的类:
    1.显示: 时钟
    2.显示: 分钟
   更具结构特征,抽象出一个类
    */
public class Show {
    private int max;
    private int value=0;

    // 传入,时或分的最大值
    public Show(int max) {
        this.max = max;
    }
    //自增
    public void increase(){
        value++;
        try {
            Thread.sleep(1_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (value==max){
            value=0;
        }
    }
    //返回当前是,几时或几分
    public int getValue(){
        return value;
    }

}
