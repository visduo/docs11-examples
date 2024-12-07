package cn.duozai.service;

import cn.duozai.dao.UserDao;
import cn.duozai.factory.UserDaoFactory;

/**
 * 用户模块业务逻辑接口实现类
 */
public class UserServiceImpl implements UserService {

    // 实例化依赖的UserDao（自己实例化）
    // UserDao userDao = new UserDaoImpl();

    // 实例化依赖的UserDao（通过工厂获取，实例化UserDao的权限交给工厂）
    UserDao userDao = UserDaoFactory.getInstance();

    /**
     * 保存用户信息
     *
     * @return 保存结果
     */
    @Override
    public boolean save() {
        // 调用userDao的方法保存用户信息
        int result = userDao.save();
        return result > 0;
    }

}
