package spring.bean.demo.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context
            = new AnnotationConfigApplicationContext();
        context.scan("spring.bean.demo.demo");
        context.refresh();

        ComponentDemo componentDemo
            = context.getBean(ComponentDemo.class);
        componentDemo.demoFunction();
 
        context.close();
    }
}