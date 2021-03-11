package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 键盘事件，被观察者
 * 被观察者中，集成观察者列表，当被观察者发生改变时，通知所有观察者，做出对应处理逻辑
 * 当被观察者发生改变时，即键盘被按下。
 */
public class Key {
    private String keyName;
    private String keyOption;

    List<AbstractObserver> observers = new ArrayList<>();

    public void notifyAllObservers() {
        for (AbstractObserver observer : observers) {
            observer.update(keyName, keyOption);
        }
    }

    public void addObserver(AbstractObserver observer) {
        observers.add(observer);
    }

    /**
     * 被观察者更新方法，当被调用后，通知观察者
     * @param keyName
     * @param keyOption
     */
    public void setKeyOption(String keyName, String keyOption) {
        this.keyOption = keyOption;
        this.keyName = keyName;
        notifyAllObservers();
    }
}
