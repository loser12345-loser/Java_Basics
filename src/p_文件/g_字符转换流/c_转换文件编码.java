package p_文件.g_字符转换流;

import java.io.*;

/*
<1> 转换文件编码；
	1.创建二个文件夹，分别写入utf-8/gbk 的字符，
	1.读取文件内容，写到第三个文件中	    */
public class c_转换文件编码 {
    public static void main(String[] args) throws IOException {
    //1.获取InputStreamReader_字符转换_输入流,读取文件内容
        InputStreamReader isr = new InputStreamReader(new FileInputStream("src/p_文件/g_字符转换流/z_aa.txt"), "gbk");
    //2.获取OutputStreamWriter_字符转换_输出流,写入文件中
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("src/p_文件/g_字符转换流/z_aa_utf_8.txt"), "utf-8");
    //3.获取字符缓冲流
        BufferedReader br = new BufferedReader(isr);
        BufferedWriter bw = new BufferedWriter(osw);
    //4.边读边写
        String line;
        while ((line = br.readLine())!=null){
            bw.write(line);
        }
    //5.释放资源
        bw.close();
        br.close();
        osw.close();
        isr.close();

    }
}
