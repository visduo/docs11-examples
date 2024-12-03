package cn.duozai.dao;

import org.apache.log4j.Logger;

/**
 * 用户模块数据访问接口实现类
 *
 * @author 多仔ヾ
 */
public class UserDaoImpl implements UserDao {

    private static final Logger logger = Logger.getLogger(UserDaoImpl.class);

    @Override
    public int save() {
        logger.debug("保存用户信息到数据库");
        return 1;
    }

}
