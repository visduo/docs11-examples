package cn.duozai.dao;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

/**
 * 用户模块数据访问接口实现类
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
