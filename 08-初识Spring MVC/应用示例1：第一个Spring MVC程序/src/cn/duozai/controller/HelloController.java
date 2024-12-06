package cn.duozai.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Hello控制器
 *
 * @author 多仔ヾ
 */
public class HelloController extends AbstractController {

    // 控制器类继承AbstractController类，并重写handleRequestInternal方法

    /**
     * 处理Web请求
     *
     * @param httpServletRequest 请求对象
     * @param httpServletResponse 响应对象
     * @return ModelAndView 模型视图对象
     * @author 多仔ヾ
     */
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("Spring MVC框架搭建成功啦");

        // 提供一个视图页面给用户
        return new ModelAndView("/WEB-INF/jsp/hello.jsp");
    }

}
