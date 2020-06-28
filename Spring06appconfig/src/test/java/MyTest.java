import com.myth.config.AppConfig;
import com.myth.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.awt.*;


/**
 * @author myth
 * @Date 2020-06-21 18:56
 */
public class MyTest {
    @Test
    public void Test01(){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = context.getBean("user", User.class);
        System.out.println(user.getName());
    }
}
