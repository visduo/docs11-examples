
import cn.duozai.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试类
 *
 * @author 多仔ヾ
 */
public class SpringTest {

    @Test
    public void test() {
        // 1、读取Spring配置文件，实例化Spring上下文对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2、根据bean-id获取Bean对象实例
        // 使用@Service注解标记UserServiceImpl时，没有为其取名，默认为类名首字母小写
        UserService userService = (UserService) applicationContext.getBean("userServiceImpl");
        // 3、执行save方法
        userService.save();
    }

}
