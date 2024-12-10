package cn.duozai.dao;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

/**
 * 用户模块数据访问接口实现类
 *
 * @Repository注解：标记为Bean对象，即将该类交给Spring管理
 * value属性：Bean对象的名称，默认为类名首字母小写
 * 相当于 <bean id="userDao" class="cn.duozai.dao.UserDaoImpl">
 */
@Repository
public class UserDaoImpl implements UserDao {

    private static final Logger logger = Logger.getLogger(UserDaoImpl.class);

    /**
     * 保存用户信息
     *
     * @return SQL语句影响行数
     */
    @Override
    public int save() {
        logger.debug("保存用户信息到数据库");
        return 1;
    }

}
