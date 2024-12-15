package cn.duozai.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 异常控制器
 * @ControllerAdvice注解：定义全局异常处理类
 */
@ControllerAdvice
public class ExceptionController {

    /**
     * 处理RuntimeException运行时异常
     *
     * @param model 模型对象
     * @param ex 处理的异常对象
     * @return 视图页面
     */
    @ExceptionHandler(value = RuntimeException.class)
    public String handlerRuntionExprction(Model model, RuntimeException ex) {
        model.addAttribute("message", ex.getMessage());
        return "error";
    }

    /**
     * 处理ArithmeticException异常
     *
     * @param model 模型对象
     * @param ex 处理的异常对象
     * @return 视图页面
     */
    @ExceptionHandler(value = ArithmeticException.class)
    public String handlerArithmeticException(Model model, Exception ex) {
        model.addAttribute("message", "数学运算错误 " + ex.getMessage());
        return "error";
    }

}
