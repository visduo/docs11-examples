import cn.duozai.service.UserService;
import cn.duozai.service.UserServiceImpl;
import org.junit.Test;

/**
 * 测试类
 */
public class UserTest {

    @Test
    public void save() {
        UserService userService = new UserServiceImpl();
        userService.save();
    }

}
