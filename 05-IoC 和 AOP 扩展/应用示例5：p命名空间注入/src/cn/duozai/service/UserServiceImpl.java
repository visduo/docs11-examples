package cn.duozai.service;

import cn.duozai.dao.UserDao;

/**
 * 用户模块业务逻辑接口实现类
 *
 * @author 多仔ヾ
 */
public class UserServiceImpl implements UserService {

    // UserDao实现类需要Spring进行注入
    UserDao userDao;

    // setter注入/设值注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean save() {
        // 调用userDao的方法保存用户信息
        int result = userDao.save();

        return result > 0;
    }

}
