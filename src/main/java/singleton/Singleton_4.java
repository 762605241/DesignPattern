package singleton;

/**
 * 懒汉式 单例模式
 * 增加锁(synchronize) 对代码块加锁，而不是整个方法上加锁。
 * 多线程并发访问可能获取到多个实例 if判断 可能被多个线程同时捕获 导致创建多个实例
 */
public class Singleton_4 {
    private static Singleton_4 singleton_4;
    private Singleton_4() {

    }
    public static Singleton_4 getInstance() {
        if (singleton_4 == null) {
            synchronized (Singleton_4.class) {
                singleton_4 = new Singleton_4();
            }
        }
        return singleton_4;
    }
}
