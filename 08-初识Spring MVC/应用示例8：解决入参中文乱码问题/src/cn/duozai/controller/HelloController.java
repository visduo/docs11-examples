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
     * 提供表单
     *
     * @return 模型视图对象
     */
    @GetMapping("/index")
    public ModelAndView index() {
        return new ModelAndView("/WEB-INF/jsp/index.jsp");
    }

    /**
     * 处理表单请求
     * @RequestParam注解：接收表单传递过来的参数
     * name属性：对应表单元素的name属性，即参数名称
     * required属性：参数是否必须传递
     * defaultValue属性：参数默认值
     *
     * @param name 视图页面表单传递的name参数
     * @param age 视图页面表单传递的age参数
     * @return 模型视图对象
     */
    @PostMapping("/hello")
    public ModelAndView hello(@RequestParam(name = "name") String name,
                              @RequestParam(name = "age", required = false, defaultValue = "18") Integer age) {
        logger.debug("视图页面表单传递的姓名 => " + name);
        logger.debug("视图页面表单传递的年龄 => " + age);

        // 暂时不返回视图页面
        return null;
    }

}
