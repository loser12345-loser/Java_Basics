package i_继承;
//子类2
public class a2_徒弟 extends a0_师傅 {
    private String canA="a2.做豆腐(同名)";
    private String canD="a2.做米粉(独有)";
    int num=30;

    @Override
    public void print() {
        System.out.println("a2_徒弟,打印输出");
    }





    public a2_徒弟() {
    }

    public a2_徒弟(String canA, String canD) {
        this.canA = canA;
        this.canD = canD;
    }

    @Override
    public String getCanA() {
        return canA;
    }

    @Override
    public void setCanA(String canA) {
        this.canA = canA;
    }

    public String getCanD() {
        return canD;
    }

    public void setCanD(String canD) {
        this.canD = canD;
    }

    @Override
    public String toString() {
        return "a2_徒弟{" +
                "canA='" + canA + '\'' +
                ", canD='" + canD + '\'' +
                '}';
    }

    public a2_徒弟(String canA, String canB, String canA1, String canD) {
        super(canA, canB);
        this.canA = canA1;
        this.canD = canD;
    }

}
