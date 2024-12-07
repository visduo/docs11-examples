package cn.duozai.dao;

/**
 * 用户模块数据访问接口
 */
public interface UserDao {

    /**
     * 保存用户信息
     *
     * @return SQL语句影响行数
     */
    int save();

}
