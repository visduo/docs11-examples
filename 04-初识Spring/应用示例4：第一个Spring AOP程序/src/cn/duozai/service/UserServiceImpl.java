package cn.duozai.service;

import cn.duozai.dao.UserDao;

/**
 * 用户模块业务逻辑接口实现类
 */
public class UserServiceImpl implements UserService {

    /**
     * 用户模块数据访问层对象，通过Spring进行注入
     */
    UserDao userDao;

    /**
     * 设置用户模块数据访问层对象
     *
     * @param userDao 用户模块数据访问层对象
     * @return void
     */
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

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
