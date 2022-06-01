package i_继承;
//子类1
public class a1_徒弟 extends a0_师傅{
    private String canA="a1.做包子(同名)";
    private String canC="a1.做馒头(独有)";
    int num=20;

    //覆盖重写,(注意:重载是名字相同,参数不同)
    @Override
    public void print() {
        System.out.println("a1_徒弟,打印输出...");
    }




    public a1_徒弟() {
    }

    public a1_徒弟(String canA, String canC) {
        this.canA = canA;
        this.canC = canC;
    }

    @Override
    public String getCanA() {
        return canA;
    }

    @Override
    public void setCanA(String canA) {
        this.canA = canA;
    }

    public String getCanC() {
        return canC;
    }

    public void setCanC(String canC) {
        this.canC = canC;
    }

    @Override
    public String toString() {
        return "a1_徒弟{" +
                "canA='" + canA + '\'' +
                ", canC='" + canC + '\'' +
                '}';
    }


    public a1_徒弟(String canA, String canB, String canA1, String canC) {
        super(canA, canB);
        this.canA = canA1;
        this.canC = canC;
    }

}
