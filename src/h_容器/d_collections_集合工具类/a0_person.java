package h_容器.d_collections_集合工具类;
//自定义类型的排序
public class a0_person<E> implements Comparable<a0_person>{
    private E name;
    private E age;

    public a0_person() {
    }

    public a0_person(E name, E age) {
        this.name = name;
        this.age = age;
    }

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }

    public E getAge() {
        return age;
    }

    public void setAge(E age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "a0_person{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }

    @Override//自定义排序规则
    public int compareTo(a0_person o) {
        //return 0;     认为元素都是相同的
        //自定义排序 比较两个人的年龄(this,参数Person)
        //return (Integer)this.getAge()-(Integer)o.getAge();    //升序
        return (Integer)o.getAge()-(Integer)this.getAge();      //降序
    }
}
