package memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 备忘录管理对象，管理所有对象的记录状态，用于恢复对象状态
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    /**
     * 记录状态
     *
     * @param memento
     */
    public void add(Memento memento) {
        mementoList.add(memento);
    }

    /**
     * 读取状态
     *
     * @param i
     * @return
     */
    public Memento get(int i) {
        return mementoList.get(i);
    }

}
