package cn.duozai.controller;

import cn.duozai.entity.User;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

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
     * @param mapModel Map对象
     * @param name 视图页面表单传递的name参数
     * @param age 视图页面表单传递的age参数
     * @return 视图页面文件路径
     */
    @PostMapping("/hello")
    public String hello(Map<String, Object> mapModel,
                        @RequestParam(name = "name") String name,
                        @RequestParam(name = "age",required = false, defaultValue = "18") Integer age) {
        logger.debug("视图页面表单传递的姓名 => " + name);
        logger.debug("视图页面表单传递的年龄 => " + age);

        // 实例化User对象
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setWebsite("http://www.duozai.cn");

        // 将数据添加到Map对象中
        mapModel.put("userObject", user);

        // 返回视图页面文件路径
        return "/WEB-INF/jsp/hello.jsp";
    }

}
