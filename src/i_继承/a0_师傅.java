package i_继承;
//父类
public class a0_师傅 {
    //父类属性
    private  String canA="a0.做羊肉粉(同名属性)";
    private  String canB="a0.做牛肉粉(父类独有)";
    protected int num=10;



    public void can(){
        System.out.println("师傅能做的...");
    }
    public void print(){
        System.out.println("父类打印输出....");
    }





    public a0_师傅() {
    }

    @Override
    public String toString() {
        return "a0_师傅{" +
                "canA='" + canA + '\'' +
                ", canB='" + canB + '\'' +
                '}';
    }

    public String getCanA() {
        return canA;
    }

    public void setCanA(String canA) {
        this.canA = canA;
    }

    public String getCanB() {
        return canB;
    }

    public void setCanB(String canB) {
        this.canB = canB;
    }

    public a0_师傅(String canA, String canB) {
        this.canA = canA;
        this.canB = canB;
    }

}
