package e_字符类型;

public class b_包裹类型 {
    public static void main(String[] args) {
    //1.使用包裹类型判断其最大/小值
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);
        System.out.println("Byte.MAX_VALUE = " + Byte.MAX_VALUE);
    //2.包裹类型 Character
        //1. static boolean isDigit(char ch)    	    //判断这个字符是不是数字
        System.out.println("'1'是不是数字:"+Character.isDigit('1'));
        //2. static boolean isLetter(char ch)    		//判断这个字符是不是字母
        System.out.println("'a'是不是字母: "+Character.isLetter('a'));
        //3. static boolean isLetterOrDigit(char ch)  //判断这个字符是不是字母或数字
        //4. static boolean isLowerCase(char ch) 		//判断这个字符是不是小写字母
        System.out.println("'a'是不是小写:"+Character.isLowerCase('a'));
        //5. static boolean isUpperCas（char ch）     //判断这个字符是不是大写字母
        System.out.println("'A'是不是大写:"+Character.isUpperCase('A'));
        //6. static boolean isWhitespace（char ch)    //判断这个字符是不是空格
        System.out.println("' '是不是空格:"+Character.isWhitespace(' '));
        //7. static char toLowerCase(char ch)         //将这个字符转换成小写
        System.out.println("'a'转换成大写: "+Character.toUpperCase('a'));
        //8. static char toUpperCase(char ch)			//将这个字符转换成大写
        System.out.println("'A'转换成小写: "+Character.toLowerCase('A'));
    }
}
