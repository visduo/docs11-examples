import cn.duozai.HelloSpring;
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
        // 1、读取Spring配置文件，实例化Spring上下文对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2、根据bean-id获取Bean对象实例
        HelloSpring helloSpring = (HelloSpring) applicationContext.getBean("helloSpring");
        // 3、执行print方法
        helloSpring.print();
    }

}
