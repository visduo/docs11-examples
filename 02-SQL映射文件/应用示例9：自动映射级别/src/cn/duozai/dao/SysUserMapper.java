package cn.duozai.dao;

import cn.duozai.entity.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

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

    /**
     * 根据条件（Map）查询用户列表
     *
     * @param sysUserMap Map对象
     * @return 用户列表
     */
    List<SysUser> getUserListByMap(Map<String, Object> sysUserMap);

    /**
     * 根据条件（Params）查询用户列表
     *
     * @param realName 真实姓名
     * @param roleId 用户角色id
     * @return 用户列表
     */
    List<SysUser> getUserListByParams(@Param("realName") String realName, @Param("rId") Integer roleId);

    /**
     * 查询用户列表，包含用户角色名称
     *
     * @return 用户列表
     */
    List<SysUser> getUserListWithRoleName();

    /**
     * 根据用户角色id查询用户列表，包含角色信息
     *
     * @param roleId 用户角色id
     * @return 用户列表
     */
    List<SysUser> getUserListByRoleId(@Param("roleId") Integer roleId);

    /**
     * 根据用户id查询用户对象，包含地址列表
     *
     * @param id 用户id
     * @return 用户表实体类对象
     */
    SysUser getUserById(@Param("userId") Integer id);

}
