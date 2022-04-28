package demo02;

import com.th.Spring.demo02.Server;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02 {

    @Test
    public void test() {
         ApplicationContext ioc = new ClassPathXmlApplicationContext("Config2.xml");

        Server server = ioc.getBean("server", Server.class);

        server.add();
    }
}
