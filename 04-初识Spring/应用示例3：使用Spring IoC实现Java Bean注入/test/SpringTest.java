import cn.duozai.Printer;
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
        Printer printer = (Printer) applicationContext.getBean("printer");
        // 3、执行print方法
        printer.print();
    }

}
