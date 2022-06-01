package g_类和对象;


/*
1.成员变量类型
    1.类作为成员变量
    2.接口作为成员变量
    */
public class f_成员变量的类型 {
    public static void main(String[] args) {
    //1.类作为成员变量
        f0_类作为成员变量 aa = new f0_类作为成员变量();
        aa.setName("xiao");
        f1_Weapen bb = new f1_Weapen("大砍刀...");
        aa.setWeapen(bb);
        aa.attack();
    //2.接口作为成员变量
        f2_接口作为成员变量 cc = new f2_接口作为成员变量();
        cc.setSkill(new f3_Skill() {
            @Override
            public void use() {
                System.out.println("暴雨梨花...");
            }
        });
        cc.setName("xiao2");
        cc.attack();


    }

}
