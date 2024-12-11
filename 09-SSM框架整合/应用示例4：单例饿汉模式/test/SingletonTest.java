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
        // 多线程创建Singleton实例
        for (int i = 0; i < 10; i++) {
            new Thread(
                    () -> {
                        // 获取Singleton实例
                        Singleton singleton = Singleton.getInstance();
                        // 多线程的情况下没有处理线程安全问题，有可能会得到多个Singleton实例
                        System.out.println(singleton);
                    }
            ).start();
        }
    }

}
