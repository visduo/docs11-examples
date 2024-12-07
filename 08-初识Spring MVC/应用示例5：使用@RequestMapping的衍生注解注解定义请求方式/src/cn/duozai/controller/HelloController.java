package cn.duozai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Hello控制器
 */
@Controller // 标记控制器类，将该类交给Spring管理
@RequestMapping("/admin")   // 为控制器中的所有方法添加统一的前缀，所有请求路径必须以/admin开头
public class HelloController {

    /**
     * 访问该方法时，使用类请求路径+方法请求路径进行访问
     * 即通过/admin/hello进行访问
     * 且类请求路径+方法请求路径在整个项目中必须保证唯一性
     * @GetMapping注解等同于method = RequestMethod.GET
     *
     * @return 模型视图对象
     */
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ModelAndView hello() {
        System.out.println("Spring MVC框架搭建成功啦");

        // 提供一个视图页面给用户
        return new ModelAndView("/WEB-INF/jsp/hello.jsp");
    }

    /**
     * 指定多个请求路径
     * 可以通过/admin/h1和/admin/h2进行访问
     * @PostMapping注解等同于method = RequestMethod.POST
     *
     * @return 模型视图对象
     */
    @PostMapping({"/h1", "/h2"})
    public ModelAndView hello2() {
        return new ModelAndView("/WEB-INF/jsp/hello.jsp");
    }

}
