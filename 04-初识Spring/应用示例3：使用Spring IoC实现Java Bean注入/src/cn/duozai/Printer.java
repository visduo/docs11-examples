package cn.duozai;

import org.apache.log4j.Logger;

/**
 * 打印机类
 */
public class Printer {

    private static final Logger logger = Logger.getLogger(Printer.class);

    /**
     * 墨盒对象
     */
    private Ink ink;

    /**
     * 设置打印机使用的墨盒
     *
     * @param ink 具体的墨盒实现类对象
     * @return void
     */
    public void setInk(Ink ink) {
        this.ink = ink;
    }

    /**
     * 纸张对象
     */
    private Paper paper;

    /**
     * 设置打印机使用的纸张
     *
     * @param paper 具体的纸张实现类对象
     * @return void
     */
    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    /**
     * 打印所使用的墨盒和纸张信息
     */
    public void print() {
        logger.debug("墨盒：" + ink.getColor());
        logger.debug("纸张：" + paper.getPaper());
    }

}
