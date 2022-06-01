package e_字符类型;
/*
1.字符转换
    1.string--->int
        1.Integer.parseInt(num);  //返回元素整数
        2.Integer.valueOf(num);   //返回一个integer对象
    2.char--->string
        1.String.valueOf('c')
        2.Character.toString('c');
        3.Character('c').toString();
        4.String(new char[]{'c'})
    3.string--->char
        1.String.charAt(index)
        2.String.toCharArray()
    */
public class e_类型转换 {
    public static void main(String[] args) {
    //1.string--->int
        String num="-123";
        //1.Integer.parseInt(num);  //返回元素整数
        int aa = Integer.parseInt(num);
        //2.Integer.valueOf(num);   //返回一个integer对象
        int bb = Integer.valueOf(num);
        System.out.println(aa+", "+bb);
    }
}
