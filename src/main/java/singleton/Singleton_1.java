package singleton;

/**
 * 饿汉式 单例模式
 * 私有构造器，实例化本类对象，提供获取实例的静态方法
 * <p>
 * 类加载到内存后，就创建一个实例，JVM保证线程安全。
 * <p>
 * 缺点：不管该实例在应用中是否被使用，只要该类加载了，就会创建。
 * <p>
 * 线程安全，因类加载就会初始化，并且类只会初始化一次，所以保证对象实例线程安全
 */
public class Singleton_1 {
    private static final Singleton_1 singleton_1 = new Singleton_1();

    private Singleton_1() {

    }

    public static Singleton_1 getInstance() {
        return singleton_1;
    }

}
