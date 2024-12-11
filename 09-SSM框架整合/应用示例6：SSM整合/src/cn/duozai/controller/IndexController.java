package cn.duozai.controller;

import cn.duozai.service.SysUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;

/**
 * 首页控制器
 */
@Controller // 标记控制器类为Bean对象，交给Spring管理
public class IndexController {

    @Resource   // 控制器调用Service层，注入Service层对象
    SysUserService sysUserService;

    /**
     * 处理/index请求
     *
     * @param model 模型对象
     * @return 视图页面文件名称
     */
    @GetMapping("/index")
    public String index(Model model) {
        // 调用Service层查询数据
        int count = sysUserService.count();
        // 将查询结果添加到模型对象中
        model.addAttribute("count", count);
        // 返回视图页面名称
        return "index";
    }

}
