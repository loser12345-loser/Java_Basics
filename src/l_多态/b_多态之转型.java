package l_多态;
/*
1.多态之转型
    1.向上转型
        1.一定是安全的
        2.缺点:   不能调用子类特有方法
    2.向下转型
        1.判断是否,就是原来的类型: instanceof
        2.作用:   调用子类特有方法
    */
public class b_多态之转型 {
    public static void main(String[] args) {
    //1.向上转型  一定是安全的
        b0_Animal animal = new b1_Cat();
        animal.eat();
//        animal.catCan();
    //2.向下转型
        if( animal instanceof b1_Cat){
            b1_Cat cat = (b1_Cat) animal;
            cat.catCan();
        }

    }
}
