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

        RecipesFromScratch recipesFromScratch
            = context.getBean(RecipesFromScratch.class);

        recipesFromScratch.getItalianBeanSoupIngredients();
 
        context.close();
    }
}