import cn.duozai.dao.SysUserMapper;
import cn.duozai.entity.SysUser;
import cn.duozai.utils.MyBatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

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

    @Test
    public void getUserList() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        List<SysUser> sysUserList = sqlSession.getMapper(SysUserMapper.class).getUserList();

        for (SysUser sysUser : sysUserList) {
            logger.debug("SysUser => " + sysUser.getRealName());
        }

        sqlSession.close();
    }

    @Test
    public void utilTest() {
        // 1、调用MyBatisUtil，创建SqlSession会话
        SqlSession sqlSession = MyBatisUtil.createSqlSession();

        // 2、执行SQL
        int count = sqlSession.getMapper(SysUserMapper.class).count();

        // 3、调试输出执行结果
        logger.debug("count => " + count);

        // 4、关闭SqlSession
        MyBatisUtil.closeSqlSession(sqlSession);
    }

    @Test
    public void getUserListByRealName() {
        SqlSession sqlSession = MyBatisUtil.createSqlSession();

        List<SysUser> sysUserList = sqlSession.getMapper(SysUserMapper.class)
                .getUserListByRealName("张");

        for (SysUser sysUser : sysUserList) {
            logger.debug("SysUser => " + sysUser.getRealName());
        }

        MyBatisUtil.closeSqlSession(sqlSession);
    }

}
