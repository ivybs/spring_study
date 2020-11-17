import com.ibs.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        // 提供给ApplicationContext构造函数的一个或者多个位置路径是资源字符串
        // 这些资源字符串使得容器可以从各种外部资源加载配置元数据
        // 获取spring的上下文对象
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("beans.xml");// 用xml加载就必须用这个加载类
        // 我们的对象现在都在spring容器中进行管理了，我们要使用，直接去里面取出来就可以了
        Hello hello = (Hello) applicationContext.getBean("hello");
        hello.show();
    }
}
