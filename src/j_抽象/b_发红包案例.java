package j_抽象;

import java.util.ArrayList;

public class b_发红包案例 {
    public static void main(String[] args) {
        b1_群主 group_leader = new b1_群主("xiaoxiao",1000);

        b2_c成员 aa = new b2_c成员("aa", 0);
        b2_c成员 bb = new b2_c成员("bb", 0);
        b2_c成员 cc = new b2_c成员("cc", 0);
        b2_c成员 dd = new b2_c成员("dd", 0);

        ArrayList<Float> list = group_leader.send(100, 4);
        aa.receive(list);
        bb.receive(list);
        cc.receive(list);
        dd.receive(list);
        System.out.println(group_leader);
        System.out.println(aa);
        System.out.println(bb);
        System.out.println(cc);
        System.out.println(dd);



    }
}
