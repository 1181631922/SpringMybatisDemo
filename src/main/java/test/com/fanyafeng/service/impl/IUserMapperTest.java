package test.com.fanyafeng.service.impl;

import com.fanyafeng.model.UserModel;
import com.fanyafeng.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Author： fanyafeng
 * Data： 16/10/16 00:02
 * Email: fanyafeng@live.cn
 */
public class IUserMapperTest {
    private ApplicationContext applicationContext;

    @Before
    public void before() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
    }


    /**
     * Method: findUserById(int id)
     */
    @Test
    public void testFindUserById() throws Exception {
//        UserService userService = (UserService) applicationContext.getBean("userService");
//        UserModel userModel = userService.findUserById(1);

//        System.out.print("输出:" + userModel.toString());
    }
}