package x_各种类;
/*
1.StringBuilder 类   字符串缓冲区(字符串可以改变,提供效率)
    1.相关概念
        1.字符类型,不可修改,字符串的拼接,需要赋值一份,效率较低
        2.字符串缓冲区,还没有被final修饰,可以修改
    2.构造方法
        1.StringBuilder()           构造一个空的StringBuilder 容器
        2.StringBuilder(string str) 构造一个stringBuilder容器,并将字符串放进去
    3.常用方法
        1.append()      添加任意类型数据的字符串格式,并返回当前对象本身
        2.toString()    将缓冲区内容转换成字符串
        3.reverse()     翻转内容
    */
public class h_StringBuilder类 {
    public static void main(String[] args) {
    //2.构造方法
        //1.StringBuilder()           构造一个空的StringBuilder 容器
        StringBuilder strBuilder = new StringBuilder();
        System.out.println("strBuilder = " + strBuilder);
        //2.StringBuilder(string str) 构造一个stringBuilder容器,并将字符串放进去
        StringBuilder str1_builder = new StringBuilder("abc");
        System.out.println("str1_builder = " + str1_builder);
    //3.常用方法
        //1.append()      添加任意类型数据的字符串格式,并返回当前对象本身
        System.out.println("strBuilder.append(\"abc\") = " + strBuilder.append("abc"));
        //链式编程
        System.out.println("strBuilder.append(\"1234\").append(\"qwert\") = "
                + strBuilder.append("1234").append("qwert"));
        //2.toString()    将缓冲区内容转换成字符串
        System.out.println("str1_builder.toString() = " + str1_builder.toString());
        //3.reverse()     翻转内容
        System.out.println("str1_builder.reverse() = " + str1_builder.reverse());

    }
}
