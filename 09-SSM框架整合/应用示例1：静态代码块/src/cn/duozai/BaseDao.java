package cn.duozai;

import org.apache.log4j.Logger;

/**
 * BaseDao
 */
public class BaseDao {

    private static final Logger logger = Logger.getLogger(BaseDao.class);

    /**
     * 在静态代码块中读取数据库的配置文件
     * 类加载的时候只会执行一次
     */
    static {
        logger.debug("BaseDao => 读取数据库配置文件");
    }

    /**
     * 模拟数据库查询
     *
     * @return void
     */
    public void executeQuery() {
        logger.debug("BaseDao => 查询数据");
    }

}
