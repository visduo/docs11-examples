package cn.duozai.entity;

import java.io.Serializable;

/**
 * 角色表实体类
 *
 * @author 多仔ヾ
 */
public class SysRole implements Serializable {

    private Integer id;

    private String code;

    private String roleName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

}
