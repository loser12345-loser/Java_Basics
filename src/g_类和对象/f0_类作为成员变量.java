package g_类和对象;

public class f0_类作为成员变量 {
    private String name;        //英雄名字
    private f1_Weapen weapen;   //武器


    public void attack(){
        System.out.println(name+",真正使用"+weapen.getWeapen());
    }

    public f0_类作为成员变量() {
    }

    public f0_类作为成员变量(String name, f1_Weapen weapen) {
        this.name = name;
        this.weapen = weapen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public f1_Weapen getWeapen() {
        return weapen;
    }

    public void setWeapen(f1_Weapen weapen) {
        this.weapen = weapen;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", weapen=" + weapen
                ;
    }
}
