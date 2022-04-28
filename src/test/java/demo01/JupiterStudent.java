package demo01;

import com.th.Spring.demo01.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = "classpath:Config1.xml")
public class JupiterStudent {
    @Autowired
    private Student student;

    @Test
    public  void studentStart() {
        System.out.println(student);
    }
}
