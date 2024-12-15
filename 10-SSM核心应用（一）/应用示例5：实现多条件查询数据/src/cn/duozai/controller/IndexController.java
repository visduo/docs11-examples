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
     * @return 视图页面
     */
    @GetMapping(value = "/index")
    public String index() {
        return "index";
    }

}
