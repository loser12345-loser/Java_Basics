package l_多态;

public class a0_父类 {
    protected int num=10;

    public void method(){
        System.out.println("这是父类的方法...");
    }
    public void a0(){
        System.out.println("这是父类,特有的方法...");
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "a0_父类{" +
                "num=" + num +
                '}';
    }
}
