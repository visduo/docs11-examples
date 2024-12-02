package cn.duozai.service;

import cn.duozai.dao.SysUserMapper;
import cn.duozai.entity.SysUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * description
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

}
