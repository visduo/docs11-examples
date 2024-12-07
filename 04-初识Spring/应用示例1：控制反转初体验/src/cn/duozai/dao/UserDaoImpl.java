package cn.duozai.dao;

/**
 * 用户模块数据访问接口实现类
 */
public class UserDaoImpl implements UserDao {

    /**
     * 保存用户信息
     *
     * @return SQL语句影响行数
     */
    @Override
    public int save() {
        System.out.println("保存用户信息到数据库");
        return 1;
    }

}
