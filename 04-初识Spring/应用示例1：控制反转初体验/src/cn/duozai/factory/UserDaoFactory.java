package cn.duozai.factory;

import cn.duozai.dao.UserDao;
import cn.duozai.dao.UserDaoImpl;

/**
 * 用户模块数据访问层工厂
 */
public class UserDaoFactory {

    /**
     * 负责创建用户DAO实例
     *
     * @return 用户模块数据访问层实现类
     */
    public static UserDao getInstance() {
        return new UserDaoImpl();
    }

}
