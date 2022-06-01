package h_容器.a_顺序容器;


import java.util.ArrayList;

public class a_ArrayList_数组列表 {
    //容器
    private ArrayList<String> notes=new ArrayList<String>();
//1.先设计框架，在实现细节
    //在后面添加
    public void add(String s) {
        this.notes.add(s);
        //notes.add(10); string 型 不能放 int
    }
    //添加，插入
    public void add(String s,int location) {
        this.notes.add(location, s);
    }
    //输出长度
    public int getSize() {
        //自带函数 size
        return this.notes.size();
    }
    public String getNote(int index) {          //获取某下标的值
        return this.notes.get(index);
    }
    //删除(输入下标)
    public void removeNote(int iddex) {
        this.notes.remove(iddex);
    }
    //输出列表
    public String[] list () {
        String[] a=new String[this.notes.size()];
/*		for(int i=0;i<notes.size();i++) {
			a[i]=notes.get(i);
		}*/
        this.notes.toArray(a);				// 相当于 for循环
        return a;
    }
    public static void main(String[] args) {
        a_ArrayList_数组列表 nb=new a_ArrayList_数组列表();
        //添加(末尾)
        nb.add("first"); nb.add("second"); nb.add("four");
        //插入(指定位置)
        nb.add("three",1);
        //获取长度
        System.out.println(nb.getSize());
        //获取对应下标的值
        System.out.println(nb.getNote(0));
        //删除
        nb.removeNote(1);
        //输出数组列表
        String[] list = nb.list();
        for(String s:list) {
            System.out.println(s);
        }
    }
}
