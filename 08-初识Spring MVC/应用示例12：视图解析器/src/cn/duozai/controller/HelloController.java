package cn.duozai.controller;

import cn.duozai.entity.User;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Hello控制器
 *
 * @author 多仔ヾ
 */
@Controller
public class HelloController {

    private static final Logger logger = Logger.getLogger(HelloController.class);

    /**
     * 提供一个表单
     *
     * @return java.lang.String
     * @author 多仔ヾ
     */
    @GetMapping("/index")
    public String index() {
        // 返回视图页面文件名称
        // 视图解析器拼接的视图路径为：/WEB-INF/jsp/index.jsp
        return "index";
    }

    /**
     * 处理表单请求
     *
     * @param model Model模型对象
     * @param name 视图页面表单传递的name参数
     * @param age 视图页面表单传递的age参数
     * @return java.lang.String
     * @author 多仔ヾ
     */
    @PostMapping("/hello")
    public String hello(Model model,
                       @RequestParam(name = "name") String name,
                       @RequestParam(name = "age",required = false, defaultValue = "18") Integer age) {
        logger.debug("视图页面表单传递的姓名 => " + name);
        logger.debug("视图页面表单传递的年龄 => " + age);

        // 实例化User对象
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setWebsite("http://www.duozai.cn");

        // 将数据添加到Model模型对象中
        model.addAttribute("userObject", user);

        // 返回视图页面文件名称
        return "hello";
    }

}
