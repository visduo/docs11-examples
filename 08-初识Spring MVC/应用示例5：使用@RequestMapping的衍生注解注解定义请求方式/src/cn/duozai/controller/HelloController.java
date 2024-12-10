package cn.duozai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Hello控制器
 *
 * @Controller注解：标记为控制器Bean对象，即将该类交给Spring管理
 * @RequestMapping注解：为控制器中的所有方法添加统一的请求路径前缀
 * 访问控制器中的方法时，使用类请求路径+方法请求路径进行访问
 * 请求路径在整个项目中必须保证唯一性
 */
@Controller
@RequestMapping("/admin")
public class HelloController {

    /**
     * 处理/hello请求
     *
     * @return 模型视图对象
     */
    @GetMapping(value = "/hello")
    public ModelAndView hello() {
        System.out.println("Spring MVC框架搭建成功啦");

        // 提供一个视图页面给用户
        return new ModelAndView("/WEB-INF/jsp/hello.jsp");
    }

    /**
     * 处理/h1和/h2请求
     *
     * @return 模型视图对象
     */
    @PostMapping(value = {"/h1", "h2"})
    public ModelAndView hello2() {
        return new ModelAndView("/WEB-INF/jsp/hello.jsp");
    }

}
