package cn.duozai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 首页控制器
 */
@Controller
public class IndexController {

    /**
     * 首页
     *
     * @return 视图页面
     */
    @GetMapping(value = "/index")
    public String index() {
        // 模拟抛出异常
        throw new RuntimeException("服务器正在开小差，请稍后再进行访问～");
        // return "index";
    }

    /**
     * 局部异常处理方法
     * @ExceptionHandler注解：标记局部异常处理方法，处理当前控制器抛出的异常
     * value属性：指定要处理的异常类型
     *
     * @param ex 处理的异常对象
     * @param request 请求对象
     * @return 视图页面
     */
    @ExceptionHandler(value = RuntimeException.class)
    public String handlerExpection(RuntimeException ex, HttpServletRequest request) {
        // 将异常信息保存到请求对象中
        request.setAttribute("message", ex.getMessage());

        // 返回错误视图页面
        return "error";
    }

}
