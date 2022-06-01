package x_各种类;


import java.time.LocalDate;

public class f0_person {
    private String name;
    private LocalDate birth;

    public f0_person() {
    }

    public f0_person(String name, LocalDate birth) {
        this.name = name;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "a_test{" +
                "name='" + name + '\'' +
                ", birth=" + birth +
                '}';
    }
}