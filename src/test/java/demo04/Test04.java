package demo04;

import com.th.Spring.demo04.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test04 {
    public static void main(String[] args) {
        ApplicationContext bean = new ClassPathXmlApplicationContext("Config4.xml");
        Student stu = bean.getBean("stu", Student.class);

        System.out.println(stu);
    }
}
