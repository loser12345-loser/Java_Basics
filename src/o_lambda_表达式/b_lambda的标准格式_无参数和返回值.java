package o_lambda_表达式;
/*
	需求：
		给定一个厨子cook接口，内含方法makeFood，且无参数无返回值
		使用lambda的标准格式调用invokeCook方法，打印输出吃饭了！
 */
public class b_lambda的标准格式_无参数和返回值 {
/*    public static void invokeCook(b0_cook cook){
        cook.makeFood();
    }*/
    public static void main(String[] args) {
   /* //1.匿名内部类
        invokeCook(new b0_cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了1");
            }
        });
    //2.调用invokeCook方法,参数是b0_cook接口,传递b0_cook的匿名内部类
        invokeCook(()->{                    //使用lambda_简化匿名内部类的书写
            System.out.println("吃饭了2");
        });*/
    //3.lambda不能在后面直接调用,接口内的方法,所以构建函数invoke
        //方式1
        b0_cook a = new b0_cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了3");
            }
        };
        a.makeFood();
        //方式2:  //创建一个类实现接口，并在main函数中实例化对象，调用方法
        b1_eat b = new b1_eat();
        b.makeFood();
        //方法3:
        new b0_cook() {     //实现接口的匿名内部类,并调用接口方法
            @Override
            public void makeFood() {
                System.out.println("吃饭了4");
            }
        }.makeFood();
    }
}
