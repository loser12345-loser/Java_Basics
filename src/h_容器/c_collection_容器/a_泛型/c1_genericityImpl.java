package h_容器.c_collection_容器.a_泛型;
//1.实现接口的时候,可以指定泛型
public class c1_genericityImpl implements c0_genericity<String>{
    @Override
    public void method(String s) {
        System.out.println("1.实现接口的时候,可以指定泛型");
    }

/*    @Override 默认泛型是 Object型
    public void method(Object o) {

    }*/
}
