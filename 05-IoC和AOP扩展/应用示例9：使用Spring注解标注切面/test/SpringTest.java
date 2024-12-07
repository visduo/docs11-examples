import cn.duozai.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试类
 */
public class SpringTest {

    /**
     * Spring测试
     *
     * @return void
     */
    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 使用@Service注解标记UserServiceImpl时，没有为其取名，其默认为类名首字母小写
        UserService userService = (UserService) applicationContext.getBean("userServiceImpl");
        userService.save();
    }

}
