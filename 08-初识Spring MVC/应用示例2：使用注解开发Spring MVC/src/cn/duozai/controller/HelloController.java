package cn.duozai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Hello控制器
 *
 * @author 多仔ヾ
 */
@Controller // 标记控制器类，将该类交给Spring管理
public class HelloController {

    /**
     * 处理/hello请求
     * @RequestMapping注解：指定请求路径为/hello
     * 访问/hello的时候，就会进入该方法
     *
     * @return org.springframework.web.servlet.ModelAndView
     * @author 多仔ヾ
     */
    @RequestMapping(value = "/hello")
    public ModelAndView hello() {
        System.out.println("Spring MVC框架搭建成功啦");

        // 提供一个视图页面给用户
        return new ModelAndView("/WEB-INF/jsp/hello.jsp");
    }

}
