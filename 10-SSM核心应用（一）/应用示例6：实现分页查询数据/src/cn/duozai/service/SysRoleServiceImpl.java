package cn.duozai.service;

import cn.duozai.dao.SysRoleMapper;
import cn.duozai.entity.SysRole;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 角色表业务逻辑接口实现类
 */
@Service
public class SysRoleServiceImpl implements SysRoleService {

    @Resource
    SysRoleMapper sysRoleMapper;

    /**
     * 查询角色列表
     *
     * @return 角色表实体类对象列表
     */
    @Override
    public List<SysRole> getRoleList() {
        // 调用DAO层查询角色表实体类对象列表
        // 返回角色表实体类对象列表
        return sysRoleMapper.selectList();
    }

}
