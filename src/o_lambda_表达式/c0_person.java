package o_lambda_表达式;
/*
	需求：
		使用数字存储多个Person对象
		对数组中的Person对象使用Arrays的sort方法通过年龄进行升序
*/
public class c0_person implements Comparable<c0_person> {
    private int age;
    private String name;



    public c0_person() {
    }

    public c0_person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "c0_personArrays{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(c0_person o) {
        return this.getAge()-o.getAge();
    }
}
