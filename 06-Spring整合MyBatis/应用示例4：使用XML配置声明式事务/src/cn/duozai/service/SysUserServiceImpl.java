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

    /**
     * 从Spring容器中注入依赖的Dao层对象
     */
    @Resource
    SysUserMapper sysUserMapper;

    /**
     * 查询用户列表
     *
     * @return 用户列表
     */
    @Override
    public List<SysUser> getUserList() {
        // Service层调用Dao层操作数据库
        return sysUserMapper.getUserList();
    }

    /**
     * 根据用户id修改密码
     *
     * @param id 用户id
     * @param newPassword 新密码
     * @return 修改结果
     */
    @Override
    public boolean updatePassword(Integer id, String newPassword) {
        int result = sysUserMapper.updatePassword(id, newPassword);

        System.out.println(1/0);
        // 抛出异常，应该做事务回滚
        // 如果没有配置声明式事务，则事务不会回滚

        return result > 0;
    }

}
