package singleton;

/**
 * 懒汉式 单例模式
 * 增加锁(synchronize) ,来保证线程安全。在获取实例方法上加锁
 * 缺点：因加锁，导致效率下降
 */
public class Singleton_3 {
    private static Singleton_3 singleton_3;

    private Singleton_3() {

    }
    public static synchronized Singleton_3 getInstance() {
        if (singleton_3 == null) {
            singleton_3 = new Singleton_3();
        }
        return singleton_3;
    }
}
