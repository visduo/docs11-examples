package cn.duozai.service;

import cn.duozai.dao.SysUserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 用户表业务逻辑接口实现类
 */
@Service    // 标记Service实现类为Bean对象，交给Spring管理
public class SysUserServiceImpl implements SysUserService {

    @Resource   // Service层调用Dao层，注入Dao层对象
    SysUserMapper sysUserMapper;

    /**
     * 查询用户表记录数
     *
     * @return 用户表记录总数
     */
    @Override
    public int count() {
        return sysUserMapper.count();
    }

}
