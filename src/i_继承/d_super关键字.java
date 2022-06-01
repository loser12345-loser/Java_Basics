package i_继承;

public class d_super关键字 {
    public static void main(String[] args) {
        d1_徒弟1 aa = new d1_徒弟1();

        System.out.println(aa.getD1_skill());
        System.out.println(aa.getD0_skill());
        aa.super_师傅属性();

    }
}
