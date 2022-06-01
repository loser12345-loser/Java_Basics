package h_容器.c_collection_容器.a_泛型;

public class b_泛型的使用 {
    public static void main(String[] args) {
    //1.不使用泛型,默认为Object
        b0_泛型的定义 aa = new b0_泛型的定义();
        //存入各种类型的值
        Object name = aa.getName();
        aa.setName("aa");
        aa.setName1(11);
        aa.setName2(false);
        System.out.println(aa);
    //2.规定泛型,为string类型
        b0_泛型的定义<String> bb = new b0_泛型的定义<>();
        String name1 = bb.getName();
        //只能放,string类型的数据
        bb.setName("aaa");
    //3.调用含泛型的方法
        b0_泛型的定义<Object> cc = new b0_泛型的定义<>();
        cc.method("aa");
        cc.method(11);
        cc.method(false);
    //4.调用含泛型的静态方法(静态方法,推荐使用类名调用)
        b0_泛型的定义.method1("aaa");
        b0_泛型的定义.method1(111);
        b0_泛型的定义.method1(true);

    }
}
