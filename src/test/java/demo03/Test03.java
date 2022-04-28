package demo03;

import com.th.Spring.demo03.Cat;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test03 {

    @Test
    public void test() {
        ApplicationContext bean = new ClassPathXmlApplicationContext("Config3.xml");

        Cat cat = bean.getBean("cat", Cat.class);
        System.out.println(cat);
    }
}
