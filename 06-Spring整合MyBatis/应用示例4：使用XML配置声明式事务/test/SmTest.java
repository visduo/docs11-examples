import cn.duozai.entity.SysUser;
import cn.duozai.service.SysUserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 测试类
 *
 * @author 多仔ヾ
 */
public class SmTest {

    private static final Logger logger = Logger.getLogger(SmTest.class);

    @Test
    public void getUserList() {
        // 1、创建Spring容器上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2、从Spring容器中获取Service层的Bean对象
        SysUserService sysUserService = (SysUserService) context.getBean("sysUserServiceImpl");
        // 3、调用Service层方法操作数据库
        List<SysUser> sysUserList = sysUserService.getUserList();
        // 4、调试输出结果
        for (SysUser sysUser : sysUserList) {
            logger.debug("SysUser => " + sysUser.getRealName());
        }
    }

    @Test
    public void updatePassword() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        SysUserService sysUserService = (SysUserService) context.getBean("sysUserServiceImpl");

        boolean result = sysUserService.updatePassword(1, "000111");

        if(result) {
            logger.debug("修改成功");
        } else {
            logger.debug("修改失败");
        }
    }

}
