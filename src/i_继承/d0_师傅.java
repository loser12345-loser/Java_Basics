package i_继承;

public class d0_师傅 {
    protected   String d0_skill="f_包子配方";

    public void method(){
        System.out.println("这是父类的方法");
    }

    public d0_师傅(String d0_skill) {
        this.d0_skill = d0_skill;
    }

    public d0_师傅() {
    }

    public String getD0_skill() {
        return d0_skill;
    }

    public void setD0_skill(String d0_skill) {
        this.d0_skill = d0_skill;
    }
}
