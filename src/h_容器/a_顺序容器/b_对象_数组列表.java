package h_容器.a_顺序容器;


import java.util.ArrayList;

public class b_对象_数组列表 {
       public static void main(String[] args) {
        // 对象的数组
        b0_Person[] aa=new b0_Person[10];
        for(int i=0;i<aa.length;i++) {
            aa[i]=new b0_Person();
            //调用对象方法,设置值
            aa[i].setI(i);
        }
        // 对象数组的 for-each 与数组的不一样，可以赋值
        for(b0_Person v:aa) {
            System.out.println(v.getI());
        }
        // 容器的 for-each
        ArrayList<String> bb=new ArrayList<String>();
        //添加数据
        bb.add("I"); bb.add("love"); bb.add("You");
        for(String k:bb) {
            System.out.println(k);
        }
        //println() 直接输出 函数
        b0_Person cc=new b0_Person();
        System.out.println(cc);
    }

}
