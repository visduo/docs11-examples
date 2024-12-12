package cn.duozai.service;

import cn.duozai.entity.SysUser;

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

}
