package o_lambda_表达式;

public class d_lambda_有参数和返回值 {

    private static void invoke(d0_calculator c, int...arr) {
        int sum=c.cal(arr);
        System.out.println("sum = " + sum);
    }

    public static void main(String[] args) {
    //1.调用invoke方发里的cal方法,方法的参数是一个接口,可以使用匿名内部类
        invoke(new d0_calculator() {
            @Override
            public int cal(int... arr) {
                int sum=0;
                for (int i = 0; i < arr.length; i++) {
                    sum+=arr[i];
                }
                return sum;
            }
        },10,20,30);
    //2.使用lambda表达式_简化内部类的书写
        invoke((arr)->{
            int sum=0;
            for (int i = 0; i < arr.length; i++) {
                sum+=arr[i];
            }
            return sum;
        },10,20);
    }


}
