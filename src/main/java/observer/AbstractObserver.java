package observer;

/**
 * 抽象观察者
 * 当被观察者发生改变时，执行更新逻辑
 */
public abstract class AbstractObserver {
    public abstract void update(String keyName, String keyOption);
}
