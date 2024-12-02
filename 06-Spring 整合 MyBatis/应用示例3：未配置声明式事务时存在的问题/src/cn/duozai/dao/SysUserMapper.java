package cn.duozai.dao;

import cn.duozai.entity.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户表数据访问接口
 *
 * @author 多仔ヾ
 */
public interface SysUserMapper {

    /**
     * 查询用户列表
     *
     * @return java.util.List<cn.duozai.entity.SysUser>
     * @author 多仔ヾ
     */
    List<SysUser> getUserList();

    /**
     * 根据用户id修改用户密码
     *
     * @param id 用户id
     * @param password 新密码
     * @return int
     * @author 多仔ヾ
     */
    int updatePassword(@Param("id") Integer id, @Param("password") String password);

}
