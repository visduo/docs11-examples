import cn.duozai.dao.UserDao;
import cn.duozai.service.UserService;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试类
 */
public class SpringTest {

    private static final Logger logger = Logger.getLogger(SpringTest.class);

    /**
     * Spring测试
     *
     * @return void
     */
    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService userService1 = (UserService) applicationContext.getBean("userServiceImpl");
        UserService userService2 = (UserService) applicationContext.getBean("userServiceImpl");
        // userService全局创建一次
        logger.debug(userService1 == userService2);

        UserDao userDao1 = (UserDao) applicationContext.getBean("userDaoImpl");
        UserDao userDao2 = (UserDao) applicationContext.getBean("userDaoImpl");
        // userDao每次调用时都会重新创建
        logger.debug(userDao1 == userDao2);
    }

}
