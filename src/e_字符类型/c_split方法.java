package e_字符类型;

import java.util.Arrays;


public class c_split方法 {

    public static void main(String[] args) {
    //1.split()方法
        String s = "The rain in Spain falls  mainly in the plain.";
        //在所有空格字符处,进行分解
        String[] ss = s.split(" ");
        System.out.println("Arrays.toString(ss) = " + Arrays.toString(ss));
        //在空格出分成,2段
        String[] s1 = s.split(" ", 2);
        System.out.println("Arrays.toString(s1) = " + Arrays.toString(s1));
    //2.特殊符号需要转义
        String value = "192.168.128.33";
        //必须进行转义  同理，如果用竖线“|”分隔的话，将出现不可得到的结果，必须改为“\\|”；
        String[] names = value.split("\\.");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]+" ");
        }

    }
}
