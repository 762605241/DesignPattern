package singleton;

/**
 * 懒汉式 单例模式
 * synchronize + 双非空判断 保证线程安全
 */
public class Singleton_5 {
    private static volatile Singleton_5 singleton_5; // volatile 禁止重排序

    private Singleton_5() {

    }

    public static Singleton_5 getInstance() {
        if (singleton_5 == null) {
            synchronized (Singleton_5.class) {
                if (singleton_5 == null) {
                    singleton_5 = new Singleton_5();
                }
            }
        }
        return singleton_5;
    }
}
