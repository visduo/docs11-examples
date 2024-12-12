package cn.duozai.service;

import cn.duozai.dao.SysUserMapper;
import cn.duozai.entity.SysUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户表业务逻辑接口实现类
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Resource
    SysUserMapper sysUserMapper;

    /**
     * 用户登录
     *
     * @param account 账号
     * @param password 密码
     * @return 用户表实体类对象
     */
    @Override
    public SysUser login(String account, String password) {
        // 封装查询条件
        SysUser where = new SysUser();
        where.setAccount(account);
        where.setPassword(password);

        // 调用DAO层根据条件查询用户表实体类对象
        // 返回用户表实体类对象
        return sysUserMapper.selectOne(where);
    }

    /**
     * 查询用户列表
     *
     * @param sysUser 用户表实体类对象（查询条件）
     * @return 用户表实体类对象列表
     */
    @Override
    public List<SysUser> getUserList(SysUser sysUser) {
        // 调用DAO层根据条件查询用户表实体类对象列表
        // 返回用户表实体类对象列表
        return sysUserMapper.selectList(sysUser);
    }

}
