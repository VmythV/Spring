import com.myth.pojo.User;
import com.myth.pojo.User2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author myth
 * @Date 2020-06-20 21:26
 */
public class TestUser {

    @Test
    public void Test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user");
        user.show();
    }
    @Test
    public void Test02(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User2 user2 = (User2) context.getBean("user2");
        user2.show();
    }
}
