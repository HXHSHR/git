package pojo;

/**
 * @author huXiaoHeng on 2024/5/25.
 */
public class Bird {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.printf("%s：小鸟小鸟，叽喳叽喳！%n", this.name);
    }
}
