package cn.duozai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Hello控制器
 * @Controller注解：标记为控制器Bean对象，即将该类交给Spring管理
 */
@Controller
public class HelloController {

    /**
     * 处理/hello请求
     * @RequestMapping注解：指定请求信息映射
     * value属性：指定请求路径
     *
     * @return 模型视图对象
     */
    @RequestMapping(value = "/hello")
    public ModelAndView hello() {
        System.out.println("Spring MVC框架搭建成功啦");

        // 提供一个视图页面给用户
        return new ModelAndView("/WEB-INF/jsp/hello.jsp");
    }

}
