package g_类和对象;

public class e1_局部内部类 {

    public void methodOuter(){
        /* final*/ int num=10;
         //num=23; 修改变量会报错

        //局部内部类
        class Inner{

            //内部类方法
            public void inner(){
                System.out.println("这是局部内部类...");
                //局部内部类,访问方法的变量,该变量必须是final的
                System.out.println("num = " + num);
            }
        }
        //创建类别类对象
        Inner inner = new Inner();
        inner.inner();



    }
}
