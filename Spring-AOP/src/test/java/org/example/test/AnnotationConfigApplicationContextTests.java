package org.example.test;

import org.example.config.Appconfig;
import org.example.service.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigApplicationContextTests {

    /**
     * Bean创建的生命周期
     * UserService.class --> 无参构造方法 --> 对象 --> 依赖注入（属性赋值）
     * -->初始化前(@PostConstruct)
     * --> 初始化 (InitializingBean) 对象 instance of InitializingBean ((InitializingBean)对象).afterPropertiesSet()
     * --> 初始化后(AOP) --> 代理对象()
     * --> Bean
     *
     * Bean的销毁的生命周期
     */
    @Test
    public void test(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);

        //Bean 对象
        UserService userService = (UserService) context.getBean("userService");

        userService.test();
    }
}
