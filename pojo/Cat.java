package pojo;

/**
 * @author huXiaoHeng on 2024/5/25.
 */
public class Cat {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.printf("%s：小猫小猫，喵喵喵！%n", this.name);
    }
}
