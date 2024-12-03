package cn.duozai.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * MyBatis 工具
 *
 * @author 多仔ヾ
 */
public class MyBatisUtil {

    private static SqlSessionFactory sqlSessionFactory;

    /**
     * 使用静态代码块唯一一次创建SqlSessionFactory实例
     * 静态代码块在类被加载时就会执行，且只执行一次
     * 无论创建多少个该类的对象，静态代码块都不会再次执行
     *
     * @author 多仔ヾ
     */
    static {
        try {
            // 读取MyBatis核心配置文件的输入流
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

            // 使用SqlSessionFactoryBuilder构建SqlSessionFactory工厂实例
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 创建并返回SqlSession实例
     *
     * @author 多仔ヾ
     */
    public static SqlSession createSqlSession() {
        // 关闭自动提交，开启事务控制
        return sqlSessionFactory.openSession(false);
    }

    /**
     * 关闭SqlSession会话
     *
     * @param sqlSession SqlSession
     * @author 多仔ヾ
     */
    public static void closeSqlSession(SqlSession sqlSession) {
        if(sqlSession != null) {
            sqlSession.close();
        }
    }

}
