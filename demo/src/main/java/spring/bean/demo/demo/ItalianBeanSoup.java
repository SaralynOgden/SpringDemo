package spring.bean.demo.demo;

import org.springframework.stereotype.Component;

@Component
public class ItalianBeanSoup {
    private CanelliniBean bean;
    private Tomato tomato;
    private Noodle noodle;
    private Salt salt;

    public ItalianBeanSoup(CanelliniBean bean, Tomato tomato, Noodle noodle, Salt salt) {
        this.bean = bean;
        this.tomato = tomato;
        this.noodle = noodle;
        this.salt = salt;
    }

    public void printIngredients() {
        System.out.println(bean.toString() + ", " + tomato.toString() + ", " + salt.toString() + ", noodles: (" + noodle.toString() + ")");
    }

    public double getBrothSalinity() {
        // TODO: measure salinity
        return 1.2;
    }
}