package p_文件.c_字符流;

import java.io.FileWriter;
import java.io.IOException;

/*   在try的后面可以增加一个（），在括号中可以定义流的对象，那么这个流的作用域就在try中有效，
     try中的代码执行完毕后，会自动把流释放，不用写finally

<1> 使用try catch finally处理流中的异常
	格式：
		try {
			可能会产生异常的代码
		}catch(异常变量 变量名) {
			异常的处理
		}finally {
			一定会执行的代码
			释放资源
		}
 */
public class d_使用try_catch_处理流的异常 {
    public static void main(String[] args) {
    //1.try-catch-finally   一般型,比较复杂
        tryCatchFinally();
    //2.try()-catch  简介型
        try_catch();
    }

    private static void try_catch() {
    //1.在try()中创建对象,作用域就在try中
        try(
            FileWriter fw = new FileWriter("src/p_文件/c_字符流/z_FileWriter.txt", true);) {
            for (int i = 0; i < 5; i++) fw.write("简介型\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void tryCatchFinally() {
    //1.扩大作用域
        FileWriter fw=null;
        try {
        //2.可能产生异常的代码
            fw = new FileWriter("src/p_文件/c_字符流/z_FileWriter.txt", true);
            for (int i = 0; i < 5; i++) fw.write("复杂型!\n");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
        //3.释放资源
            if(fw!=null){  //如果对象创建失败,fw的默认值是null,null不能调用close,就会报错
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
