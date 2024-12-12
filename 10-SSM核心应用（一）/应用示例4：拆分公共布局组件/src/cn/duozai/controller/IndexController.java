package cn.duozai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 首页控制器
 */
@Controller
public class IndexController {

    /**
     * 首页
     *
     * @return 首页视图页面名称
     */
    @GetMapping(value = "/index")
    public String index() {
        return "index";
    }

}
