package cn.duozai.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Hello控制器
 */
@Controller
public class HelloController {

    private static final Logger logger = Logger.getLogger(HelloController.class);

    /**
     * 提供一个表单
     *
     * @return 模型视图对象
     */
    @GetMapping("/index")
    public ModelAndView index() {
        return new ModelAndView("/WEB-INF/jsp/index.jsp");
    }

    /**
     * 处理表单请求
     *
     * @param name 视图页面表单传递的name参数
     * @param age 视图页面表单传递的age参数
     * @return 模型视图对象
     */
    @PostMapping("/hello")
    public ModelAndView hello(@RequestParam(name = "name") String name,
                              @RequestParam(name = "age",required = false, defaultValue = "18") Integer age) {
        logger.debug("视图页面表单传递的姓名 => " + name);
        logger.debug("视图页面表单传递的年龄 => " + age);

        ModelAndView mv = new ModelAndView();
        // 将数据添加到ModelAndView模型视图对象中
        // 在JSP页面中就可以通过EL表达式获取数据
        mv.addObject("name", name);
        mv.addObject("age", age);

        // 设置视图页面文件路径
        mv.setViewName("/WEB-INF/jsp/hello.jsp");

        // 返回模型视图对象
        return mv;
    }

}
