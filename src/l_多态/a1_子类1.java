package l_多态;

public class a1_子类1 extends a0_父类 {
    int num=20;

    @Override
    public int getNum() {
        return num;
    }

    @Override
    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public void method() {
        System.out.println("这是子类1实现的父类方法.....");
    }
}
