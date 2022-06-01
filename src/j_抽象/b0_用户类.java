package j_抽象;

public class b0_用户类 {
    private String name;
    private float rest;


    public b0_用户类() {
    }

    public b0_用户类(String name, float rest) {
        this.name = name;
        this.rest = rest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRest() {
        return rest;
    }

    public void setRest(float rest) {
        this.rest = rest;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", rest='" + rest + '\'';
    }
}
