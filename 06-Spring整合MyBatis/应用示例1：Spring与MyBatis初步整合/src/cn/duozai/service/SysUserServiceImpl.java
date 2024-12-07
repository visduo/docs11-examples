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

}
