package cn.duozai.dao;

import cn.duozai.entity.SysUser;

import java.util.List;

/**
 * 用户表数据访问接口
 */
public interface SysUserMapper {

    /**
     * 查询用户表记录数
     *
     * @return 用户表记录总数
     */
    int count();

    /**
     * 查询用户列表
     *
     * @return 用户列表
     */
    List<SysUser> getUserList();

    /**
     * 根据真实姓名模糊查询用户列表
     *
     * @param realName 真实姓名
     * @return 用户列表
     */
    List<SysUser> getUserListByRealName(String realName);

    /**
     * 根据条件（SysUser）查询用户列表
     *
     * @param sysUser 用户表实体类对象
     * @return 用户列表
     */
    List<SysUser> getUserListBySysUser(SysUser sysUser);

}
