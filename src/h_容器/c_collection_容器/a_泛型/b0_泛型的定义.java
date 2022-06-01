package h_容器.c_collection_容器.a_泛型;
/*
1.泛型的定义
    1.定义一个,含泛型的类
    2.定义一个,含泛型的方法
        1.泛型定义在方法的(修饰符)和(返回值类型)之间
        2.在调用方法的时候确定泛型的数据类型     --传递什么类型的参数,泛型就是什么类型
    3.定义一个,含泛型的静态方法
        */
//1.定义一个,含泛型的类
public class b0_泛型的定义<E> {
    private E name;
    private E name1;
    private E name2;

    //2.定义一个,含泛型的方法  名字可以自己定义
    public <M> void method(M m){
        System.out.println("m = " + m);
    }
    //3.定义一个,含泛型的静态方法
    public static <S> void method1(S s){
        System.out.println("s = " + s);
    }










    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }

    public E getName1() {
        return name1;
    }

    public void setName1(E name1) {
        this.name1 = name1;
    }

    public E getName2() {
        return name2;
    }

    public void setName2(E name2) {
        this.name2 = name2;
    }

    @Override
    public String toString() {
        return "name=" + name +
                ", name1=" + name1 +
                ", name2=" + name2
                ;
    }
}
