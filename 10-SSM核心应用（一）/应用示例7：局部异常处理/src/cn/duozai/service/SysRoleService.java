package cn.duozai.service;

import cn.duozai.entity.SysRole;

import java.util.List;

/**
 * 角色表业务逻辑接口
 */
public interface SysRoleService {

    /**
     * 查询角色列表
     *
     * @return 角色表实体类对象列表
     */
    List<SysRole> getRoleList();

}
