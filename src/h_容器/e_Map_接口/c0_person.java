package h_容器.e_Map_接口;

import java.util.Objects;

public class c0_person {
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        c0_person c0_person = (c0_person) o;
        return age == c0_person.age && Objects.equals(name, c0_person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public c0_person() {
    }

    public c0_person(String name, int age) {
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

    @Override
    public String toString() {
        return "c0_person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
