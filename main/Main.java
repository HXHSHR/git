package main;

import pojo.Bird;
import pojo.Cat;

/**
 * @author huXiaoHeng on 2024/5/25.
 */
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("小花");
        //小猫会叫
        cat.sound();
        Bird bird = new Bird();
        bird.setName("小欢");
        //小鸟也会叫
        bird.sound();
    }
}
