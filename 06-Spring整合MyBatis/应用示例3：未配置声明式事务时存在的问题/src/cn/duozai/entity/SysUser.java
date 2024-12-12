package cn.duozai.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户表实体类
 */
public class SysUser implements Serializable {

	/**
	 * 主键id
	 */
	private Integer id;

	/**
	 * 账号
	 */
	private String account;

	/**
	 * 真实姓名
	 */
	private String realName;

	/**
	 * 密码
	 */
	private String password;

	/**
	 * 性别，1女/2男
	 */
	private Integer sex;

	/**
	 * 出生日期
	 */
	private Date birthday;

	/**
	 * 手机号码
	 */
	private String phone;

	/**
	 * 用户角色id
	 */
	private Integer roleId;

	/**
	 * 证件照片
	 */
	private String certFile;

	/**
	 * 工作证照片
	 */
	private String avatarFile;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getCertFile() {
		return certFile;
	}

	public void setCertFile(String certFile) {
		this.certFile = certFile;
	}

	public String getAvatarFile() {
		return avatarFile;
	}

	public void setAvatarFile(String avatarFile) {
		this.avatarFile = avatarFile;
	}

}
