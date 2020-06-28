import com.myth.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author myth
 * @Date 2020-06-21 14:03
 */
public class MyTest {

    @Test
    public void Test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = context.getBean("user", User.class);
        user.getCat().shout();
        user.getDog().shout();
    }
}
