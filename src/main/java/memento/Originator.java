package memento;

/**
 * 原件
 * 要被保存状态的对象，保存对象当前状态(所有属性值),并具有存储状态及恢复状态的方法
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * 保存状态
     * @return
     */
    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    /**
     * 恢复状态
     */
    public void getStateFromMemento(Memento memento) {
        this.state = memento.getState();
    }
}
