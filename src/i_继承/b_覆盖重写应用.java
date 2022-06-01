package i_继承;

public class b_覆盖重写应用 {
    public static void main(String[] args) {
        b0_old_phone old = new b0_old_phone();
        old.functionA();
        old.functionB();
        old.functionC();
        System.out.println("new-------------------");
        b1_new_phone new_one = new b1_new_phone();
        new_one.functionA();
        new_one.functionB();
        new_one.functionC();

    }
}
