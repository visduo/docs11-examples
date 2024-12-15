package cn.duozai.service;

import cn.duozai.dao.SysUserMapper;
import cn.duozai.entity.SysUser;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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

    /**
     * 查询用户列表（分页）
     *
     * @param sysUser 用户表实体类对象（查询条件）
     * @param pageNum 页码
     * @param pageSize 页大小
     * @return 分页数据对象，包含分页参数和用户表实体类对象列表
     */
    @Override
    public PageInfo<SysUser> getUserPage(SysUser sysUser, Integer pageNum, Integer pageSize) {
        // 调用PageHelper分页插件开始分页
        // 传入页码和页大小，PageHelper插件拦截开始分页查询
        PageHelper.startPage(pageNum, pageSize);

        // 调用DAO层根据条件查询用户表实体类对象列表
        // 正常调用查询列表的方法，DAO层不需要改造，分页插件会自动改造分页SQL语句
        List<SysUser> sysUserList = sysUserMapper.selectList(sysUser);

        // 将用户表实体类对象列表封装到分页数据对象中，并返回分页数据对象
        return PageInfo.of(sysUserList);
    }

}
