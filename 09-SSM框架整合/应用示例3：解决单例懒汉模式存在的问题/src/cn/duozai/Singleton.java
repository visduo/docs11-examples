package cn.duozai;

/**
 * Singleton类
 * 确保该类在整个应用程序中只有一个实例存在
 * 并提供一个全局访问点来获取这个唯一的实例
 */
public class Singleton {

    /**
     * 自行创建实例对象
     * 外界不能随意实例化该类，需要在该类内部实例化一个实例
     * 实例化的实例是静态的、私有的
     */
    private static Singleton singleton;

    /**
     * 一个类只有一个实例
     * 不允许外界随意实例化该类，将构造函数私有化
     *
     * @return null
     */
    private Singleton() {

    }

    /**
     * 对外提供实例对象
     * 对外提供实例对象的方法应该是公有的、静态的方法
     * 该方法创建或获取本类中的静态私有对象并返回
     * synchronized：同步方法，保证线程安全
     *
     * @return Singleton实例
     */
    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            // 创建Singleton实例
            singleton = new Singleton();
        }

        // 返回Singleton实例
        return singleton;
    }

}
