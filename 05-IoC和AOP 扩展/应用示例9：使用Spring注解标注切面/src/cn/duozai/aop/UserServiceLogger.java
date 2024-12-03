package cn.duozai.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 日志增强处理类
 *
 * @author 多仔ヾ
 */
@Aspect // 标记为切面类 = 切入点+增强处理
@Component  // 标记为Bean对象，相当于<bean id="logger" class="cn.duozai.aop.UserServiceLogger"/>
public class UserServiceLogger {

    private static final Logger logger = Logger.getLogger(UserServiceLogger.class);

    /**
     * 环绕增强
     *
     * @param jp 连接点对象，是JoinPoint的子接口
     * @return java.lang.Object
     * @author 多仔ヾ
     */
    @Around("execution(boolean save())")    // 标记环绕增强
    public Object around(ProceedingJoinPoint jp) {
        logger.debug(jp.getSignature().getName() + "方法开始执行");

        Object result = null;
        try {
            // 调用真正的目标方法
            result = jp.proceed();

            logger.debug("方法执行后，返回：" + result);
        } catch (Throwable ex) {
            logger.debug(jp.getSignature().getName() + "方法发生异常: " + ex.getMessage());
        } finally {
            logger.debug(jp.getSignature().getName() + "方法执行结束");
        }

        return result;
    }

}
