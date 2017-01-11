package test.com.fanyafeng.service.impl;

import com.fanyafeng.mapper.IUserMapper;
import com.fanyafeng.model.UserModel;
import com.fanyafeng.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.*;

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

//        IUserMapper iUserMapper = (IUserMapper) applicationContext.getBean("IUserMapper");
//        UserModel userModel = iUserMapper.findUserById(1);
//        System.out.print("输出:" + userModel.toString());

        File f = new File("/Users/fanyafeng/IntelliJProject/SpringMybatisDemo/src/main/resources/apk/recreation_001.apk");
        String b = file2String(f, "GBK");
        System.out.println(b);
    }

    public static String file2String(File f, String charset) {
        String result = null;
        try {
            result = stream2String(new FileInputStream(f), charset);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static String stream2String(InputStream in, String charset) {
        StringBuffer sb = new StringBuffer();
        try {
            Reader r = new InputStreamReader(in, charset);
            int length = 0;
            for (char[] c = new char[1024]; (length = r.read(c)) != -1;) {
                sb.append(c, 0, length);
            }
            r.close();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}