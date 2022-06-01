package o_lambda_表达式;

import com.sun.org.apache.bcel.internal.generic.NEW;

/*
1.Lambda表达式的标准格式
    1.三部分组成：
        a.一些参数
        b.一个箭头
        c.一段代码
    2.格式：
        new Thread(
        （参数列表）->{
        一些重写方法的代码
        }
        ).start();   //调用Runnable中的run()方法
    3.对比
        （参数列表）->{							// new Runnable () {
        一些重写方法的代码		                    //	  public void run() {
        }						                //				System .out .println("这是通过匿名内部类实现的多线程！!");
        )  							            //	  }
        }                                       // }
        左边的是lambda表达式，右边的是匿名内部类的表达式
2.优缺点
    1.lambda的优点是简化代码，但缺点是不能直接调用，接口中的方法（指的是 run());
    2.匿名类的好处是可以在后面直接调用run（）方法。
    3.在启动线程是必须调用Thread的start()方法，这里的指的是在其他接口类中的lambda的比较
        */
public class a_lambda_实现多线程 {
    public static void main(String[] args) {
    //1.使用lambda_开启多线程
        new Thread(() -> {
            System.out.println("lambda_实现多线程");
        }).start();
    //2.lambda_极简式
        new Thread(()-> System.out.println("lambda_极简式,实现多线程")).start();
    }

}
