package cn.duozai.factory;

import cn.duozai.dao.UserDao;
import cn.duozai.dao.UserDaoImpl;

/**
 * 用户模块数据访问层工厂
 *
 * @author 多仔ヾ
 */
public class UserDaoFactory {

    /**
     * 负责创建用户DAO实例
     *
     * @return cn.duozai.dao.UserDao
     * @author 多仔ヾ
     */
    public static UserDao getInstance() {
        return new UserDaoImpl();
    }

}
