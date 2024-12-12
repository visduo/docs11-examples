package cn.duozai.dao;

import cn.duozai.entity.SysUser;

/**
 * 用户表数据访问接口
 */
public interface SysUserMapper {

    /**
     * 根据条件查询用户对象，包含角色信息
     *
     * @param sysUser 用户表实体类对象（查询条件）
     * @return 用户表实体类对象
     */
    SysUser selectOne(SysUser sysUser);

}
