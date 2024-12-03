package cn.duozai;

import org.apache.log4j.Logger;

/**
 * 打印机
 *
 * @author 多仔ヾ
 */
public class Printer {

    private static final Logger logger = Logger.getLogger(Printer.class);

    // 墨盒对象
    private Ink ink;

    // 设置墨盒对象
    public void setInk(Ink ink) {
        this.ink = ink;
    }

    // 纸张对象
    private Paper paper;

    // 设置纸张对象
    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    /**
     * 打印
     *
     * @author 多仔ヾ
     */
    public void print() {
        logger.debug("墨盒：" + ink.getColor());
        logger.debug("纸张：" + paper.getPaper());
    }

}
