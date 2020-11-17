package com.ibs.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//等价于在xml文件中写     <bean id="user" class="com.ibs.pojo.User"/>
@Component
public class User {
    //相当于<property name="name" value="ibs">
    // 也可以写在set方法上
    @Value("ibs")
    public String name;
}
