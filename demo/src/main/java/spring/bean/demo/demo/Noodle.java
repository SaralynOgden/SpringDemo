package spring.bean.demo.demo;

import org.springframework.stereotype.Component;

@Component
public class Noodle {
    private Flour flour;
    private Egg egg;
    private Salt salt;
    private Water water;

    public Noodle(Flour flour, Egg egg, Salt salt, Water water) {
        this.flour = flour;
        this.egg = egg;
        this.salt = salt;
        this.water = water;
    }

    public String toString() {
        return flour.toString() + ", " + egg.toString() + ", " + salt.toString() + ", " + water.toString();
    }
}
