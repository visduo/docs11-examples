package cn.duozai.service;

import cn.duozai.entity.SysUser;
import com.github.pagehelper.PageInfo;

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

    /**
     * 查询用户列表（分页）
     *
     * @param sysUser 用户表实体类对象（查询条件）
     * @param pageNum 页码
     * @param pageSize 页大小
     * @return 分页数据对象，包含分页参数和用户表实体类对象列表
     */
    PageInfo<SysUser> getUserPage(SysUser sysUser, Integer pageNum, Integer pageSize);

}
