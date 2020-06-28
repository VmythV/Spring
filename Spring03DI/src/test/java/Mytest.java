import com.myth.pojo.Student;
import com.myth.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author myth
 * @Date 2020-06-20 23:03
 */
public class Mytest {

    @Test
    public void TestDI(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());

        /**
         * Student{
         * name='张三',
         * address=Address{address='杭州'},
         * books=[JAVA, Mysql, Python],
         * hobbies=[唱, 跳],
         * card={学生证=777788889999, 身份证=123456789},
         * games=[LOL, PUBG],
         * wife='null',
         * info={password=123456, url=local, name=root}}
         */
    }

    @Test
    public void TestDI02(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = context.getBean("user1", User.class);
        System.out.println(user.toString());
    }

    @Test
    public void TestDI03(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user1 = context.getBean("user1", User.class);
        User user2 = context.getBean("user1", User.class);
        System.out.println(user1.toString());
        System.out.println(user2.toString());
        System.out.println(user1==user2);
    }
}
