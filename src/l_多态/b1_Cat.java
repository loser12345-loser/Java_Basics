package l_多态;

public class b1_Cat extends b0_Animal {

    @Override
    void eat() {
        System.out.println("猫吃鱼..");
    }

    //子类特有方法
    public void catCan(){
        System.out.println("猫抓老鼠...");
    }
}
