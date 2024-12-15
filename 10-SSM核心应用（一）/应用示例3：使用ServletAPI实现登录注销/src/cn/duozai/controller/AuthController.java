package cn.duozai.controller;

import cn.duozai.entity.SysUser;
import cn.duozai.service.SysUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * 权限认证控制器
 */
@Controller
public class AuthController {

    @Resource
    SysUserService sysUserService;

    /**
     * 登录页面
     *
     * @return 视图页面
     */
    @GetMapping(value = "/login")
    public String login() {
        // 返回登录视图页面
        return "login";
    }

    /**
     * 处理登录请求
     *
     * @param model 模型对象
     * @param httpSession 会话对象
     * @param account 账号
     * @param password 密码
     * @return 视图页面
     */
    @PostMapping(value = "/login")
    public String login(Model model,
                        HttpSession httpSession,
                        @RequestParam(name = "account") String account,
                        @RequestParam(name = "password") String password) {
        // 调用Service层进行登录操作
        SysUser sysUser = sysUserService.login(account, password);

        // sysUser == null 即账号或密码错误，DAO层查不到数据，Service层返回null
        if(sysUser == null) {
            // 登录失败
            // 存放错误提示
            model.addAttribute("message", "账号或密码错误");
            // 返回登录视图页面
            return "login";
        } else {
            // 登录成功
            // 将用户表实体类对象存到session会话中
            httpSession.setAttribute("sysUser", sysUser);
            // 跳转到首页
            // redirect：实现页面重定向
            return "redirect:/index";
        }
    }

    /**
     * 处理退出登录请求
     *
     * @param httpSession 会话对象
     * @return 视图页面
     */
    @GetMapping(value = "/logout")
    public String logout(HttpSession httpSession) {
        // 销毁会话
        httpSession.invalidate();
        // 跳转到登录页面
        return "redirect:/login";
    }

}
