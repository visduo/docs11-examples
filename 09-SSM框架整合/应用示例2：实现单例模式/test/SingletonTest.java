import cn.duozai.Singleton;
import org.junit.Test;

/**
 * 单例模式测试类
 */
public class SingletonTest {

    /**
     * 单例模式测试
     *
     * @return void
     */
    @Test
    public void test() {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // Signleton实例全局唯一
        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println(singleton1 == singleton2);
    }

}
