package h_容器.c_collection_容器.a_泛型;

public class c_含有泛型的接口 {
    public static void main(String[] args) {
    //1.创建实现类对象(实现类中,已经指定泛型)
        c1_genericityImpl aa = new c1_genericityImpl();
        aa.method("aaa");
    //2.匿名对象类(实现接口,并指明泛型)
        new c0_genericity<Object>() {
            @Override
            public void method(Object o) {
                System.out.println("o = " + o);
            }
        };
    //3.实现类与接口泛型一致, 创建对象时指定泛型类型
        c2_genericityImpl2<Integer> bb = new c2_genericityImpl2<>();
        bb.method(1234);

    }
}
