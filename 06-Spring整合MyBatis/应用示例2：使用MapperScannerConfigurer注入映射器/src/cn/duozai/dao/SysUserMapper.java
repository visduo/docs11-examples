package cn.duozai.dao;

import cn.duozai.entity.SysUser;

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



}
