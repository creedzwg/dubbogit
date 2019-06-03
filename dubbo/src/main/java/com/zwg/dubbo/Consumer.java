package com.zwg.dubbo;


import com.zwg.dubbo.bean.User;
import com.zwg.dubbo.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;


/**
 * @Author: zwg15
 * @Date: 2019/5/28
 * @Version: V1.0
 * @Description:
 */
public class Consumer {
    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
       UserService userService= (UserService) context.getBean("userService");
        User user = userService.getUser(1);
        System.out.println(user);
        System.in.read(); // 按任意键退出

    }
}
