import cn.duozai.dao.SysUserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * 测试类
 *
 * @author 多仔ヾ
 */
public class SysUserMapperTest {

    private static final Logger logger = Logger.getLogger(SysUserMapperTest.class);

    @Test
    public void count() throws IOException {
        // 1、读取MyBatis核心配置文件的输入流
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 2、使用SqlSessionFactoryBuilder构建SqlSessionFactory工厂实例
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

        // 3、创建SqlSession会话实例
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 4、通过字符串关键字标识执行SQL：namespace+id
        // int count = sqlSession.selectOne("cn.duozai.dao.SysUserMapper.count");

        // 5、构建Mapper接口执行SQL：创建SysUserMapper接口实例，调用方法执行SQL
        int count = sqlSession.getMapper(SysUserMapper.class).count();

        // 6、调试输出执行结果
        logger.debug("count => " + count);

        // 7、关闭SqlSession会话实例
        sqlSession.close();
    }

}
