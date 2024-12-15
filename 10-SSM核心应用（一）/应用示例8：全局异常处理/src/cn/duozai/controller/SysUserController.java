package cn.duozai.controller;

import cn.duozai.entity.SysRole;
import cn.duozai.entity.SysUser;
import cn.duozai.service.SysRoleService;
import cn.duozai.service.SysUserService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户模块控制器
 */
@Controller
@RequestMapping(value = "/sysUser")
public class SysUserController {

    @Resource
    SysUserService sysUserService;
    @Resource
    SysRoleService sysRoleService;

    /**
     * 用户列表页面
     *
     * @param model 模型对象
     * @param pageNum 查询条件-页码，默认为1
     * @param account 查询条件-账号
     * @param roleId 查询条件-用户角色id
     * @return 视图页面
     */
    @GetMapping(value = "/list")
    public String list(Model model,
                       @RequestParam(name = "pageNum", required = false, defaultValue = "1") Integer pageNum,
                       @RequestParam(name = "account", required = false) String account,
                       @RequestParam(name = "roleId", required = false) Integer roleId) {
        // 封装查询条件
        SysUser where = new SysUser();
        where.setAccount(account);
        where.setRoleId(roleId);

        // 调用Service层查询数据
        // List<SysUser> sysUserList = sysUserService.getUserList(where);
        PageInfo<SysUser> pageInfo = sysUserService.getUserPage(where, pageNum, 5);
        List<SysRole> sysRoleList = sysRoleService.getRoleList();

        // 将用户表实体类对象列表添加到模型对象中，用于页面遍历列表展示表格
        // model.addAttribute("sysUserList", sysUserList);

        // 将分页数据对象添加到模型对象中，用于页面获取数据展示分页信息
        model.addAttribute("pageInfo", pageInfo);
        // 将角色表实体类对象列表添加到模型对象中，用于页面遍历列表展示下拉框
        model.addAttribute("sysRoleList", sysRoleList);
        // 将查询条件添加到模型对象中，用于查询表单数据回显
        model.addAttribute("where", where);

        // 返回用户列表视图页面
        return "sysUser/list";
    }

}
