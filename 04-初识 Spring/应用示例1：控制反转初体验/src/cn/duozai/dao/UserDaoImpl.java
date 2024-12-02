package cn.duozai.dao;

/**
 * 用户模块数据访问接口实现类
 *
 * @author 多仔ヾ
 */
public class UserDaoImpl implements UserDao {

    @Override
    public int save() {
        System.out.println("保存用户信息到数据库");
        return 1;
    }

}
