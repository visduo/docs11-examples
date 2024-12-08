import cn.duozai.entity.SysUser;
import cn.duozai.service.SysUserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 测试类
 */
public class SmTest {

    private static final Logger logger = Logger.getLogger(SmTest.class);

    /**
     * 查询用户列表
     *
     * @return void
     */
    @Test
    public void getUserList() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SysUserService sysUserService = (SysUserService) context.getBean("sysUserServiceImpl");

        List<SysUser> sysUserList = sysUserService.getUserList();
        for (SysUser sysUser : sysUserList) {
            logger.debug("SysUser => " + sysUser.getRealName());
        }
    }

}
