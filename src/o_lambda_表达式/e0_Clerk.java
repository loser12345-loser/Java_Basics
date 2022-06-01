package o_lambda_表达式;
//服务员类_其对象被生产者和消费者共享
public class e0_Clerk {
    private int  product=0;  //表示是否有产品

//1.使用同步方法_保证线程安全
    //厨师调用的方法,放产品
    public synchronized void setProduct(int product) throws InterruptedException {
        if(this.product>0){  //有产品
            wait();          //服务员手中有产品_厨师等待
        }
        this.product = product;
        System.out.printf("厨师炒出(%d)\n",this.product);
        notify();   //通知等待区的吃货,开吃
    }

    //该方法由消费者调用_从服务员手中拿走产品
    public synchronized int getProduct() throws InterruptedException {
        if (this.product<=0){   //服务员手中没有产品
            wait();
        }
        int p=this.product;

        System .out.printf("吃货吃掉(%d)%n", this.product);
        System .out.println("");
        this .product=-1; //取走产品，-1表示服务员手中没有产品
        //通知等待区中的生产者可以继续工作
        notify();
        return p ;
    }
}
