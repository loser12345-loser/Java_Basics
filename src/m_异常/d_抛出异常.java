package m_异常;
/*
 <1>什么能扔？
 	1.任何继承了Throwable 类的对象
 	2.Exception继承了Throwable
 	3.throw new Exception();
 <2>异常声名遇到的继承关系
 	1.当覆盖一个函数时，子类不能声名抛出比父类的版本更多的异常
 	2.在子类的构造函数中，必须声名父类可能抛出的全部异常
 */
class OpenException extends Throwable{}
class closeException extends Throwable{}


public class d_抛出异常 {

    public static int open() {
        int[] a=new int[10];
        a[10]=10;
        return -1;
    }
    //声名会抛出的异常
    public static void readFile() throws OpenException,closeException {
        if(open()==-1) {
            throw new OpenException();  //抛出 异常
        }
    }
    public static void main(String[] args) {
        //处理异常
        try {
            readFile();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (OpenException e) {
            e.printStackTrace();
        } catch (closeException e) {
            e.printStackTrace();
        }
    }
}
