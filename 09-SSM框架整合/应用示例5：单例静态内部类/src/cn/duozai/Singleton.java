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
     * 类初始化的时候不创建Singleton实例
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
     * 静态内部类
     * 在首次使用该静态内部类的时候才会被加载
     */
    public static class SingletonHelper {
        // 定义为静态常量
        private static final Singleton INSTANCE = new Singleton();
    }

    /**
     * 对外提供实例对象
     * 对外提供实例对象的方法应该是公有的、静态的方法
     * 该方法创建或获取本类中的静态私有对象并返回
     *
     * @return Singleton实例
     */
    public static Singleton getInstance() {
        // 调用静态内部类，获取Singleton实例
        return SingletonHelper.INSTANCE;
    }

}
