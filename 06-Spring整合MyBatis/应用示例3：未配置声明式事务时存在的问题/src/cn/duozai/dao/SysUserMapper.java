package cn.duozai.dao;

import cn.duozai.entity.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户表数据访问接口
 */
public interface SysUserMapper {

    /**
     * 查询用户列表
     *
     * @return 用户列表
     */
    List<SysUser> getUserList();

    /**
     * 根据用户id修改密码
     *
     * @param id 用户id
     * @param newPassword 新密码
     * @return SQL语句影响行数
     */
    int updatePassword(@Param("userId") Integer id, @Param("newPassword") String newPassword);

}
