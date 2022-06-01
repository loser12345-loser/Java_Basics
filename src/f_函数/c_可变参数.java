package f_函数;
/*
1.可变参数
    1.参数必须是相同的类型
    2.原理:   将全部参数组合成一个数组
    3.注意事项
        1.一方法中,只能有一个可变参数
        2.可变参数,写在最后面
     4.终结写法 Object...arr    所有类型    */
public class c_可变参数 {
    public static void main(String[] args) {
        sum("aa",1,2,3,4,5,6,7,8,9,10);
        int[] aa={1,2,3,4,5};
        sum("bb",aa);
    }

//1.求n个整数的和
    private static void sum(String s,int...arr) {
        int sum=0;
        for (int i : arr) {
            sum+=i;
        }
        System.out.println("s = " + s);
        System.out.println("sum = " + sum);
    }
}
