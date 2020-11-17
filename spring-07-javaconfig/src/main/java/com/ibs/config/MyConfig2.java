package com.ibs.config;

import com.ibs.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 这个也会注册到Spring容器中进行托管，因为他本来就是个@Component，点进源码进去看就知道了
 * @ Configuration  代表的是一个配置类，就和我们之前看到的beans.xml一样的
 * */
@Configuration
@ComponentScan("com.ibs.pojo")
// 导入了另一个配置文件
@Import(MyConfig.class)
public class MyConfig2 {

    // 注册一个bean，就相当于我们之前写的一个bean标签
    // 这个方法的名字就相当于bean标签中的id属性
    // 这个方法的返回值，就相当于bean标签中的class属性
    @Bean
    public User user(){
        return new User();
    }
}
