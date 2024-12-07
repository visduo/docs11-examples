package cn.duozai;

import org.apache.log4j.Logger;

/**
 * HelloSpring实体类
 */
public class HelloSpring {

    private static final Logger logger = Logger.getLogger(HelloSpring.class);

    /**
     * hello属性
     */
    private String hello;

    /**
     * 输出方法
     */
    public void print() {
        logger.debug("Spring说：" + hello);
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

}
