package h_容器.d_collections_集合工具类;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
1.collections   集合工具类
    1.常用方法
        1.addAll(容器名,元素/数组)    往容器中添加多个值
        2.shuffle(List<?> list)     打乱元素的顺序
        3.sort(List<T> list)        排序,默认是升序
            1.自定义类型排序
                1.必须实现 comparable       接口
                2.覆盖重写 comperareTo方法   定义排序规则
                3.相减来升降排序,this在前是升序
        4.sort(List<T> list, compartor<? super T>)  找第三方来判断(compartor匿名接口)
        5.reverse(List<?> list)     倒序
        */
public class a_常用功能 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
    //1.addAll(容器名,元素/数组)    往容器中添加多个值
        Collections.addAll(list,"aa","bb","cc");
        Object[] aa={"aaa","bbb",11,22};
        Collections.addAll(list,aa);
        System.out.println("list = " + list);
    //2.shuffle(List<?> list)   打乱元素的顺序
        Collections.shuffle(list);
        System.out.println("list_shuffle = " + list);
    //3.sort(List<T> list)      排序,默认是升序
        ArrayList<Integer> list_order = new ArrayList<>();
        Collections.addAll(list_order,1,7,8,4,5,3,2);
        Collections.sort(list_order);
        System.out.println("list1 = " + list_order);
        //自定义类型排序
        ArrayList<a0_person> person_list = new ArrayList<>();
        Collections.addAll(person_list,
                new a0_person("aa",18),
                new a0_person("bb",16),
                new a0_person("cc",19),
                new a0_person("dd",19)
        );
//        Collections.sort(person_list);
        //
        Collections.sort(person_list, new Comparator<a0_person>() {
            @Override
            public int compare(a0_person o1, a0_person o2) {
                //return (Integer)o1.getAge()-(Integer) o2.getAge();  //升序
                //return (Integer) o2.getAge()-(Integer)o1.getAge();  //降序
                //年龄相同,按首字母排序
                int result=0;
                if (o1.getAge() instanceof Integer&&o2.getAge() instanceof Integer){
                     result = (Integer) o1.getAge() - (Integer) o2.getAge();
                    if (result==0){
                        String s1 = (String) o1.getName();
                        String s2 = (String) o2.getName();
                        //按姓名首字母排序
                        result = s1.charAt(0) - s2.charAt(0);
                    }
                }
                return result ;
            }
        });
        System.out.println("person_list = " + person_list);
        //4.reverse(List<?> list)   倒序
        Collections.reverse(list_order);
        System.out.println("list_reverse = " + list_order);
    }
}
