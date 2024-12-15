package cn.duozai.dao;

import cn.duozai.entity.SysRole;

import java.util.List;

/**
 * 角色表数据访问接口
 */
public interface SysRoleMapper {

    /**
     * 查询角色列表
     *
     * @return 角色表实体类对象列表
     */
    List<SysRole> selectList();

}
