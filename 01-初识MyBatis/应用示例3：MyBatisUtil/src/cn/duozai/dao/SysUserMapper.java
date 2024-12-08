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

}
