import cn.duozai.dao.SysUserMapper;
import cn.duozai.entity.Address;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Test
    public void getUserListBySysUser() {
        SqlSession sqlSession = MyBatisUtil.createSqlSession();

        // 封装SysUser查询条件
        SysUser searchSysUser = new SysUser();
        searchSysUser.setRealName("刘");
        searchSysUser.setRoleId(2);

        List<SysUser> sysUserList = sqlSession.getMapper(SysUserMapper.class)
                .getUserListBySysUser(searchSysUser);

        for (SysUser sysUser : sysUserList) {
            logger.debug("SysUser => " + sysUser.getRealName());
        }

        MyBatisUtil.closeSqlSession(sqlSession);
    }

    @Test
    public void getUserListByMap() {
        SqlSession sqlSession = MyBatisUtil.createSqlSession();

        // 封装SysUserMap查询条件
        Map<String, Object> sysUserMap = new HashMap<>();
        sysUserMap.put("rName", "刘");
        sysUserMap.put("rId", 2);

        List<SysUser> sysUserList = sqlSession.getMapper(SysUserMapper.class)
                .getUserListByMap(sysUserMap);

        for (SysUser sysUser : sysUserList) {
            logger.debug("SysUser => " + sysUser.getRealName());
        }

        MyBatisUtil.closeSqlSession(sqlSession);
    }

    @Test
    public void getUserListByParams() {
        SqlSession sqlSession = MyBatisUtil.createSqlSession();

        // 只根据角色id查询，不根据真实姓名查询
        List<SysUser> sysUserList = sqlSession.getMapper(SysUserMapper.class)
                .getUserListByParams(null, 2);

        for (SysUser sysUser : sysUserList) {
            logger.debug("SysUser => " + sysUser.getRealName());
        }

        MyBatisUtil.closeSqlSession(sqlSession);
    }

    @Test
    public void getUserListWithRoleName() {
        SqlSession sqlSession = MyBatisUtil.createSqlSession();

        List<SysUser> sysUserList = sqlSession.getMapper(SysUserMapper.class)
                .getUserListWithRoleName();

        for (SysUser sysUser : sysUserList) {
            // realName虽然没有手动绑定映射关系，但实体类属性名与数据库字段名一致，它也能自动映射
            // 指定了手动映射规则，实体类属性名（userRoleName）与数据库字段名（roleName）绑定了关系
            // logger.debug("SysUser => " + sysUser.getRealName() + "的角色名称为：" + sysUser.getUserRoleName());
        }

        MyBatisUtil.closeSqlSession(sqlSession);
    }

    @Test
    public void getUserListByRoleId() {
        SqlSession sqlSession = MyBatisUtil.createSqlSession();

        List<SysUser> sysUserList = sqlSession.getMapper(SysUserMapper.class)
                .getUserListByRoleId(2);

        for (SysUser sysUser : sysUserList) {
            logger.debug("SysUser => " + sysUser.getRealName() + "的角色名称为：" + sysUser.getSysRole().getRoleName());
        }

        MyBatisUtil.closeSqlSession(sqlSession);
    }

    @Test
    public void getUserById() {
        SqlSession sqlSession = MyBatisUtil.createSqlSession();

        SysUser sysUser = sqlSession.getMapper(SysUserMapper.class)
                .getUserById(1);

        logger.debug("SysUser => " + sysUser.getRealName());
        for (Address address : sysUser.getAddressList()) {
            logger.debug("Address => " + address.getAddressDesc());
        }

        MyBatisUtil.closeSqlSession(sqlSession);
    }

    @Test
    public void add() {
        SqlSession sqlSession = MyBatisUtil.createSqlSession();

        SysUser sysUser = new SysUser();
        sysUser.setAccount("addtest1");
        sysUser.setRealName("添加测试");

        int result = sqlSession.getMapper(SysUserMapper.class).add(sysUser);

        if(result == 1) {
            logger.debug("用户" + sysUser.getRealName() + "添加成功");
        } else {
            logger.debug("用户" + sysUser.getRealName() + "添加失败");
        }

        // sqlSessionFactory.openSession(false) 时需要手动提交事务
        // 将openSession的参数设置为true，则不需要手动提交事务，其自动提交事务
        sqlSession.commit();

        MyBatisUtil.closeSqlSession(sqlSession);
    }

    @Test
    public void updatePassword() {
        SqlSession sqlSession = MyBatisUtil.createSqlSession();

        int result = sqlSession.getMapper(SysUserMapper.class)
                .updatePassword(1, "888999");

        if(result == 1) {
            logger.debug("用户密码修改成功");
        } else {
            logger.debug("用户密码修改失败");
        }

        // MyBatisUtil已开启自动提交事务
        // sqlSessionFactory.openSession(true);
        // sqlSession.commit();

        MyBatisUtil.closeSqlSession(sqlSession);
    }

    @Test
    public void deleteUserById() {
        SqlSession sqlSession = MyBatisUtil.createSqlSession();

        int result = sqlSession.getMapper(SysUserMapper.class)
                .deleteUserById(17);

        if(result == 1) {
            logger.debug("用户删除成功");
        } else {
            logger.debug("用户删除失败");
        }

        MyBatisUtil.closeSqlSession(sqlSession);
    }

    @Test
    public void getUserListByChoose() {
        SqlSession sqlSession = MyBatisUtil.createSqlSession();

        List<SysUser> sysUserList = sqlSession.getMapper(SysUserMapper.class)
                .getUserListByChoose("limingxing", null, 2);

        for (SysUser sysUser : sysUserList) {
            logger.debug("SysUser => " + sysUser.getRealName() + "  roleId => " + sysUser.getRoleId() + " account => "  + sysUser.getAccount());
        }

        MyBatisUtil.closeSqlSession(sqlSession);
    }

}
