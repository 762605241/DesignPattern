package singleton;

/**
 * 懒汉式又称延迟加载(lazy loading) 单例模式
 * 什么时候用，什么时候初始化
 * 私有构造器，提供获取实例方法，调用方法时创建创建实例
 * 线程不安全, 多线程并发访问时，可能会创建多个实例
 */
public class Singleton_2 {
    private static Singleton_2 singleton_2;

    private Singleton_2() {

    }

    public static Singleton_2 getInstance() {
        if (singleton_2 == null) {
            singleton_2 = new Singleton_2();
        }
        return singleton_2;
    }
}
