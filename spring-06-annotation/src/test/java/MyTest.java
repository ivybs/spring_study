import com.ibs.controller.UserController;
import com.ibs.dao.UserDao;
import com.ibs.pojo.User;
import com.ibs.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        User user = applicationContext.getBean("user",User.class);
        System.out.println(user.name);
        UserDao userDao = applicationContext.getBean("userDao",UserDao.class);
        UserService userService = applicationContext.getBean("userService",UserService.class);
        UserController userController = applicationContext.getBean("userController",UserController.class);


    }


}
