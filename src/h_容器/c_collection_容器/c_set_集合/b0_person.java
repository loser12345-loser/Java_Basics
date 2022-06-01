package h_容器.c_collection_容器.c_set_集合;

import java.util.Objects;

public class b0_person<E> {
    private E name;
    private E age;

    public b0_person() {
    }

    public b0_person(E name, E age) {
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
        return "b0_person{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }

    //add()方法会调用equals和hashCode方法,哈希值不同存储,哈希值相同内容不同存储
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        b0_person<?> b0_person = (b0_person<?>) o;
        return name.equals(b0_person.name) && age.equals(b0_person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
