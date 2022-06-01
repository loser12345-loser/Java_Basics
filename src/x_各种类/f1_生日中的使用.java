package x_各种类;



import java.time.LocalDate;

public class f1_生日中的使用 {
    public static void main(String[] args) {
        f0_person xiaoxiao =
                new f0_person("xiaoxiao",
                        LocalDate.of(1999, 9, 22));
        System.out.println("xiaoxiao = " + xiaoxiao);
    }

}