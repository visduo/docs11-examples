import cn.duozai.dao.UserDao;
import cn.duozai.service.UserService;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试类
 *
 * @author 多仔ヾ
 */
public class SpringTest {

    private static final Logger logger = Logger.getLogger(SpringTest.class);

    @Test
    public void test() {
        // 1、读取Spring配置文件，实例化Spring上下文对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2、根据bean-id获取Bean对象实例
        // 3、判断结果

        UserService userService1 = (UserService) applicationContext.getBean("userService");
        UserService userService2 = (UserService) applicationContext.getBean("userService");
        // userService全局创建一次
        logger.debug(userService1 == userService2);

        UserDao userDao1 = (UserDao) applicationContext.getBean("userDao");
        UserDao userDao2 = (UserDao) applicationContext.getBean("userDao");
        // userDao每次调用时都会重新创建
        logger.debug(userDao1 == userDao2);
    }

}
