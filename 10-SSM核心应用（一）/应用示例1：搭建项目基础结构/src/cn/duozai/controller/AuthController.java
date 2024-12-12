package cn.duozai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 权限认证控制器
 */
@Controller
public class AuthController {

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

}
