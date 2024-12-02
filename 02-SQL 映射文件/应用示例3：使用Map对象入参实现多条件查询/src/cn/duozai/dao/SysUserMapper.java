package cn.duozai.dao;

import cn.duozai.entity.SysUser;

import java.util.List;
import java.util.Map;

/**
 * 用户表数据访问接口
 *
 * @author 多仔ヾ
 */
public interface SysUserMapper {

    /**
     * 查询用户表记录数
     *
     * @return int
     * @author 多仔ヾ
     */
    int count();

    /**
     * 查询用户列表
     *
     * @return java.util.List<cn.duozai.entity.SysUser>
     * @author 多仔ヾ
     */
    List<SysUser> getUserList();

    /**
     * 根据真实姓名模糊匹配查询用户列表
     *
     * @param realName 真实姓名
     * @return java.util.List<cn.duozai.entity.SysUser>
     * @author 多仔ヾ
     */
    List<SysUser> getUserListByRealName(String realName);

    /**
     * 根据条件（SysUser）查询用户列表
     *
     * @param sysUser 用户表实体
     * @return java.util.List<cn.duozai.entity.SysUser>
     * @author 多仔ヾ
     */
    List<SysUser> getUserListBySysUser(SysUser sysUser);

    /**
     * 根据条件（Map）查询用户列表
     *
     * @param sysUserMap 查询条件Map
     * @return java.util.List<cn.duozai.entity.SysUser>
     * @author 多仔ヾ
     */
    List<SysUser> getUserListByMap(Map<String, Object> sysUserMap);

}
