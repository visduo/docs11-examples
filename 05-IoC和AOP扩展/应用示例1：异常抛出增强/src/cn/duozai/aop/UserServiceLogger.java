package cn.duozai.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

/**
 * 日志增强处理类
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

}
