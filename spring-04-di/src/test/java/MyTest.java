import com.ibs.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        User user = applicationContext.getBean("user1", User.class);
        User user1 = applicationContext.getBean("user1",User.class);
        // 单例模式
        System.out.println(user==user1);

    }
}
