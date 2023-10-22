package spring.bean.demo.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ItalianBeanSoupTests {

    @Mock Tomato tomato;
    @Mock CanelliniBean bean;
    @Mock Noodle noodle;

	@Test
	void getSalinityTest() {
        Salt salt = new Salt();
        ItalianBeanSoup italianBeanSoup = new ItalianBeanSoup(bean, tomato, noodle, salt);
        assertEquals(1.2, italianBeanSoup.getBrothSalinity());
	}

}
