package cn.duozai.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * MyBatis工具类
 */
public class MyBatisUtil {

    private static SqlSessionFactory sqlSessionFactory;

    /**
     * 使用静态代码块唯一一次创建SqlSessionFactory实例
     * 静态代码块在类被加载时就会执行，且只执行一次
     * 无论创建多少个该类的对象，静态代码块都不会再次执行
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
     * @return SqlSession实例
     */
    public static SqlSession createSqlSession() {
        // 开启自动提交，关闭事务控制
        return sqlSessionFactory.openSession(true);
    }

    /**
     * 关闭SqlSession会话
     *
     * @param sqlSession SqlSession实例
     */
    public static void closeSqlSession(SqlSession sqlSession) {
        if(sqlSession != null) {
            sqlSession.close();
        }
    }

}
