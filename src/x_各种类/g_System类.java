package x_各种类;

import java.util.Arrays;

/*
1.System类   获取与系统相关的信息或系统级操作
    1.currentTimeMillis()   返回以毫秒为单位的当前时间
    2.arraycopy(            数组的拷贝
        object src,int srcPos,      数组1和数组的起始位置
        Object dest,int destPos,    数组2和数组的起始位置
        int length)                 长度
    */
public class g_System类 {
    public static void main(String[] args) {
    //1.currentTimeMillis()   返回以毫秒为单位的当前时间
        long begin = System.currentTimeMillis();
        //执行程序
        for (int i = 0; i < 999; i++) {
            int sum=i+1;
        }
        System.out.println("\n 程序用时:"+(System.currentTimeMillis()-begin)+"毫秒");
    //2.arraycopy(Object src,  int  srcPos,Object dest, int destPos,int length);
        int[] a={0,1,2,3,4,5,6,7,8,9};
        int[] b={9,8,7,6,5,4,3,2,1,0};
        System.arraycopy(a,0,b,0,3);
        System.out.println(Arrays.toString(b));

    }
}
