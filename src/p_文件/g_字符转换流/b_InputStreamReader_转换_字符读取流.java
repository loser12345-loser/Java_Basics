package p_文件.g_字符转换流;

import java.io.*;

/*
<1> InputStreamWriter : 字符输入，是字节流向字符的桥梁，可以指定要读入的字符编码格式；  ---解码
1.java.io.InputStreamWriter extends Reader
2.构造方法：
	1.InputStreamReader(InputStream in)                     ：创建使用默认字符编码的InputStreamReader
	2.InputStreamReader(InputStream in,String charsetName)  : 创建使用指定字符集的编码InputStreamReader
	参数：
		InputStream in  ：字符输出流，可以用来转换从文件中读取字符格式
		String charsetName ；指定编码表格式，不区分大小写  可以是 UTF-8/utf-8  GBK/gbk ，默认为UTF-8
3.使用步骤：
	1.创建ItputStreamReader对象，构造方法中传递字节输输入流和指定的编码格式
	2.使用InputStreamReader对象中的read方法，把字符转换为字节写入文件
	3.释放资源*/
public class b_InputStreamReader_转换_字符读取流 {
    public static void main(String[] args) throws IOException {
    //1.获取InputStreamReader_字符转换读入流  字节输入流-->字符输入流
        InputStreamReader isr = new InputStreamReader(new FileInputStream("src/p_文件/g_字符转换流/z_字符_字节.txt"), "utf-8");
        InputStreamReader isr1 = new InputStreamReader(new FileInputStream("src/p_文件/g_字符转换流/z_字符_字节_GBK.txt"), "gbk");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("src/p_文件/g_字符转换流/z_aa.txt"));
        //2.读取数据
        //1.一次读单个字符
        int len=0;
/*        while ((len=isr1.read())!=-1){
            System.out.print((char) len);
        }*/
        //2.一次读一个字符数组
        char[] chars = new char[10];
        while ((len=isr1.read(chars))!=-1){
            System.out.println(new String(chars));
            osw.write(chars);
        }
        System.out.println();
        //3.使用字符缓冲流__一次读一行
        BufferedReader br = new BufferedReader(isr);
        String line;
        while ((line =br.readLine())!=null){
            System.out.println(line);
        }

        //3.释放资源
        isr.close();
        isr1.close();
        osw.close();
    }
}
