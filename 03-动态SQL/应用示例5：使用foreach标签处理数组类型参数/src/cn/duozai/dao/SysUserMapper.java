package cn.duozai.dao;

import cn.duozai.entity.SysUser;
import org.apache.ibatis.annotations.Param;

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

    /**
     * 根据条件（Params）查询用户列表
     *
     * @param realName 真实姓名
     * @param roleId 角色组id
     * @return java.util.List<cn.duozai.entity.SysUser>
     * @author 多仔ヾ
     */
    List<SysUser> getUserListByParams(@Param("realName") String realName, @Param("rId") Integer roleId);

    /**
     * 获取用户列表，包括角色名称
     *
     * @return java.util.List<cn.duozai.entity.SysUser>
     * @author 多仔ヾ
     */
    List<SysUser> getUserListWithRoleName();

    /**
     * 根据角色组id查询用户列表，包含角色信息
     *
     * @param roleId 角色ID
     * @return java.util.List<cn.duozai.entity.SysUser>
     * @author 多仔ヾ
     */
    List<SysUser> getUserListByRoleId(@Param("roleId") Integer roleId);

    /**
     * 根据用户id查询用户信息，包含地址列表
     *
     * @param id 用户id
     * @return cn.duozai.entity.SysUser
     * @author 多仔ヾ
     */
    SysUser getUserById(@Param("userId") Integer id);

    /**
     * 添加用户
     *
     * @param sysUser 用户表实体
     * @return int
     * @author 多仔ヾ
     */
    int add(SysUser sysUser);

    /**
     * 根据用户id修改用户密码
     *
     * @param id 用户id
     * @param newPassword 新密码
     * @return int
     * @author 多仔ヾ
     */
    int updatePassword(@Param("userId") Integer id, @Param("newPassword") String newPassword);

    /**
     * 根据用户id删除用户
     *
     * @param id 用户id
     * @return int
     * @author 多仔ヾ
     */
    int deleteUserById(@Param("userId") Integer id);

    /**
     * 根据条件（Params）查询用户列表，三选一
     *
     * @param account 用户账号
     * @param realName 真实姓名
     * @param roleId 角色组id
     * @return java.util.List<cn.duozai.entity.SysUser>
     * @author 多仔ヾ
     */
    List<SysUser> getUserListByChoose(@Param("account") String account, @Param("realName") String realName, @Param("rId") Integer roleId);

    /**
     * 根据角色组id数组查询用户列表
     *
     * @param roleIds 角色组id数组
     * @return java.util.List<cn.duozai.entity.SysUser>
     * @author 多仔ヾ
     */
    List<SysUser> getUserListByRoleIdArray(@Param("roleIdsArray") Integer[] roleIds);

}
