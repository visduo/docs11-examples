import cn.duozai.BaseDao;
import org.junit.Test;

/**
 * 静态代码块测试类
 */
public class StaticTest {

    /**
     * BaseDao测试
     *
     * @return void
     */
    @Test
    public void test() {
        // 第一次调用BaseDao查询数据
        BaseDao baseDao1 = new BaseDao();
        baseDao1.executeQuery();

        // 第二次调用BaseDao查询数据
        BaseDao baseDao2 = new BaseDao();
        baseDao2.executeQuery();
    }

}
