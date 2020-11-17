import com.ibs.config.MyConfig;
import com.ibs.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        // 如果完全使用了配置类方式去做，只能通过annotationConfigApplicationContext来获取容器
        // 通过配置类的class对象来加载
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user.name);
    }
}
