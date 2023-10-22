package spring.bean.demo.demo;
 
import org.springframework.stereotype.Component;

@Component
public class RecipesFromScratch {
    private ItalianBeanSoup italianBeanSoup;

    public RecipesFromScratch(ItalianBeanSoup italianBeanSoup) {
        this.italianBeanSoup = italianBeanSoup;
    }

    public void getItalianBeanSoupIngredients() {
        italianBeanSoup.printIngredients();
    }
}