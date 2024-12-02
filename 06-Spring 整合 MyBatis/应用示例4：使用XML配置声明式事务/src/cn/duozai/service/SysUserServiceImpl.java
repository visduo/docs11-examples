package cn.duozai.service;

import cn.duozai.dao.SysUserMapper;
import cn.duozai.entity.SysUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户表业务逻辑接口实现类
 *
 * @author 多仔ヾ
 */
// 将Service层实现类标记为Bean对象，交给Spring管理
@Service
public class SysUserServiceImpl implements SysUserService {

    // 从Spring容器中注入Dao层
    @Resource
    SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> getUserList() {
        // Service层调用Dao层操作数据库
        return sysUserMapper.getUserList();
    }

    @Override
    public boolean updatePassword(Integer id, String password) {
        int result = sysUserMapper.updatePassword(id, password);

        System.out.println(1/0);
        // 抛出异常，应该做事务回滚
        // 如果没有配置声明式事务，则事务不会回滚

        return result > 0;
    }

}
