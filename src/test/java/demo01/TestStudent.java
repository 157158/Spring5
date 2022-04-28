package demo01;

import com.th.Spring.demo01.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

    @Test
    public void studentStart() {
        //1.创建IOC容器对象
        //  注: resources下的配置文件会在运行时被拷贝到类路径的根目录
        ApplicationContext ioc =
                new ClassPathXmlApplicationContext("Config1.xml");
        //2.获取配置创建对象
        //  注: Student.class 表示转换类型
        Student student = ioc.getBean("stu", Student.class);
        //3. 打印输出
        System.out.println(student);
    }
}
