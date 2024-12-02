package cn.duozai;

import org.apache.log4j.Logger;

/**
 * HelloSpring
 *
 * @author 多仔ヾ
 */
public class HelloSpring {

    private static final Logger logger = Logger.getLogger(HelloSpring.class);

    // 定义hello属性
    private String hello;

    // getter/setter
    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    /**
     * 输出方法
     *
     * @author 多仔ヾ
     */
    public void print() {
        logger.debug("Spring说：" + hello);
    }

}
