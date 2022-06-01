package h_容器.a_顺序容器;


public class a0_对象_数组 {
    private String name;
    private int age;

    public a0_对象_数组() {
    }

    public a0_对象_数组(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*@Override
    public String toString() {
        return "a_test{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }*/

    public static void main(String[] args)  {
    //1.对象数组 确定长度是固定的
        a0_对象_数组[] array = new a0_对象_数组[3];
        //new 返回的是该对象的地址(堆栈中)
        a0_对象_数组 aa = new a0_对象_数组("aa", 23);
        a0_对象_数组 bb = new a0_对象_数组("bb", 24);
        a0_对象_数组 cc = new a0_对象_数组("cc", 25);
        //将地址存到数组中
        array[0]=aa;
        array[1]=bb;
        array[2]=cc;
        for (int i = 0; i < 3; i++) {
            System.out.println(array[i]);
        }
        //获取对象数据
        System.out.println("array[0] = " + array[0].getName());


    }

}
