package singleton;

/**
 * 通过静态内部类方式 实现单例
 * 优点 线程安全
 * 加载外部类时，不会加载内部类，只有在使用静态内部类时，进行加载，延时加载(懒加载)
 */
public class Singleton_6 {
    private Singleton_6() {

    }

    private static class Singleton {
        private final static Singleton_6 singleton_6 = new Singleton_6();
    }

    public static Singleton_6 getInstance() {
        return Singleton.singleton_6;
    }
}
