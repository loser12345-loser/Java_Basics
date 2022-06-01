package g_类和对象;

public class e0_成员内部类 {
    private int num=10;

    //成员内部类
    public class Inner{
        private int num=20;

        //成员内部类--方法
        public void inner(){
            System.out.println("这是内部类的方法...");
            System.out.println("this.num = " + this.num);
            //3.内部类 通过outer.this.属性名 访问外部类属性和方法
            System.out.println("Outer.this.num = " + e0_成员内部类.this.num);
        }
    }

    //外部类方法
    public void outer(){
        new Inner().inner();
    }


}
