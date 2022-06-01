package f_函数;

/*
<1>方法的重载: 方法名相同,参数不同
    1.参数个数不同
    2.参数类型不同
    3.不同类型参数顺序不同
    */
public class a_方法的重载 {
    public static void main(String[] args) {
    //1.参数个数不同
        System.out.println("sum(1,2) = " + sum(1,2));
        System.out.println("sum(1,2,3) = " + sum(1,2,3));
    //2.参数类型
        System.out.println("sum(aaa,12) = " + sum("aaa",12));
        System.out.println("sum(aaa,12,13) = " + sum("aaa",12,13));
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }

    public static String sum(String a,int b){
        return a+b;
    }
    public static String sum(String a,int b,int c){
        return a+b+c;
    }
}
