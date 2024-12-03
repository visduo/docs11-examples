package cn.duozai.service;

import cn.duozai.entity.SysUser;

import java.util.List;

/**
 * 用户表业务逻辑接口
 *
 * @author 多仔ヾ
 */
public interface SysUserService {

    /**
     * 查询用户列表
     *
     * @return java.util.List<cn.duozai.entity.SysUser>
     * @author 多仔ヾ
     */
    List<SysUser> getUserList();

}
