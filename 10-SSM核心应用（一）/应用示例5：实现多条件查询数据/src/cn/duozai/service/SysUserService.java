package cn.duozai.service;

import cn.duozai.entity.SysUser;

import java.util.List;

/**
 * 用户表业务逻辑接口
 */
public interface SysUserService {

    /**
     * 用户登录
     *
     * @param account 账号
     * @param password 密码
     * @return 用户表实体类对象
     */
    SysUser login(String account, String password);

    /**
     * 查询用户列表
     *
     * @param sysUser 用户表实体类对象（查询条件）
     * @return 用户表实体类对象列表
     */
    List<SysUser> getUserList(SysUser sysUser);

}
