package e_字符类型;

import java.util.Objects;

/*
1.equals 判断两个字符串 内容是否相同
    1.a.eqluals(b)
    2."xxx ".equals(str)  "xxx"放在前面,若前面为空会报空指针异常
    3.Objects.equals(a,b)  可以为空
    */
public class d_equals {
    public static void main(String[] args) {
        String aa = "Hello";
        String bb = "Hello";
        char[] charArray={'H','e','l','l','o'};
        String cc = new String(charArray);
    //1.aa.equals(bb)
        System.out.println("aa.equals(bb) = " + aa.equals(bb));
        System.out.println("aa.equals(cc) = " + aa.equals(cc));
    //2."xxx ".equals(str)  "xxx"放在前面,若前面为空会报空指针异常
        String dd=null;
        System.out.println("\"hello\".equals(dd) = " + "hello".equals(dd));
        //空字符串不能放在前面
        try {
            System.out.println("dd.equals(\"hello\") = " + dd.equals("hello"));
        } catch (Exception exception) {
            System.out.println("异常:"+exception.getMessage());
        }
        //Objects.equals(a,b)  可以为空
        System.out.println("Objects.equals(dd,\"hello\") = " + Objects.equals(dd,"hello"));
    //3.忽略大小写比较
        String ee = "hello";
        System.out.println("ee.equalsIgnoreCase(aa) = " + ee.equalsIgnoreCase(aa));


    }
}
