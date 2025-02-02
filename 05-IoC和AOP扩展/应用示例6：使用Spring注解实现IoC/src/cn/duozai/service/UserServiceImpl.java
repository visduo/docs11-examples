package cn.duozai.service;

import cn.duozai.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户模块业务逻辑接口实现类
 * @Service注解：标记为Bean对象，即将该类交给Spring管理
 */
@Service
public class UserServiceImpl implements UserService {

    /**
     * Service定义对于DAO层的引用，从Spring中注入DAO
     * @Autowired注解：注入类型为UserDao的Bean对象
     */
    @Autowired
    UserDao userDao;

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
