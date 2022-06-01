package n_多线程;

/*
资源类：包子类
设置包子的属性：
		皮
		馅
		包子的状态：有-true 没有 false
 */
public class e0_BaoZi {
    private String pi;          //皮
    private String xian;        //馅
    private boolean flag=false;         //包子的状态

    public String getPi() {
        return pi;
    }

    public void setPi(String pi) {
        this.pi = pi;
    }

    public String getXian() {
        return xian;
    }

    public void setXian(String xian) {
        this.xian = xian;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "e0_BaoZi{" +
                "pi='" + pi + '\'' +
                ", xian='" + xian + '\'' +
                ", flag=" + flag +
                '}';
    }
}
