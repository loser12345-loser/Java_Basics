package i_继承;

public class b1_new_phone extends b0_old_phone{
    @Override
    public void functionC() {
        super.functionC();      //调用父类方法
        System.out.println("显示姓名...");
        System.out.println("显示头像...");
    }
}
