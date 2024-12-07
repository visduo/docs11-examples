package cn.duozai.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 日志增强处理类
 *
 * 在增强处理类中主要定义增强方法，即要额外做的事情
 */
public class UserServiceLogger {

    private static final Logger logger = Logger.getLogger(UserServiceLogger.class);

    /**
     * 前置增强：在方法执行之前要做的事情
     *
     * @param jp 连接点方法对象
     * @return void
     */
    public void before(JoinPoint jp) {
        logger.debug("开始调用" + jp.getTarget() + "的" + jp.getSignature().getName() + "方法。");
    }

    /**
     * 后置增强：方法执行之后做增强
     *
     * @param jp 连接点方法对象
     * @param result 原方法的返回值
     * @return void
     */
    public void afterReturning(JoinPoint jp, Object result) {
        logger.debug("方法执行后，返回：" + result);
    }

    /**
     * 异常抛出增强：方法抛出异常时做增强
     *
     * @param jp 连接点对象
     * @param ex 具体异常对象
     * @return void
     */
    public void afterThrowing(JoinPoint jp, Exception ex) {
        logger.debug(jp.getSignature().getName() + "方法抛出异常: " + ex.getMessage());
    }

    /**
     * 最终增强：方法执行完毕，无论是否抛出异常，都会执行增强操作
     *
     * @param jp 连接点对象
     * @return void
     */
    public void after(JoinPoint jp) {
        logger.debug(jp.getSignature().getName() + "方法执行结束");
    }

    /**
     * 环绕增强
     *
     * @param jp 连接点对象，是JoinPoint的子接口
     * @return 方法返回值对象
     */
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
