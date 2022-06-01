package g_类和对象;

public class f2_接口作为成员变量 {
    private String name;    //英雄名称
    private f3_Skill skill; //英雄技能

    public void attack(){
        System.out.print(name+",");
        skill.use();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public f3_Skill getSkill() {
        return skill;
    }

    public void setSkill(f3_Skill skill) {
        this.skill = skill;
    }

    public f2_接口作为成员变量() {
    }

    public f2_接口作为成员变量(String name, f3_Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", skill=" + skill
                ;
    }
}
