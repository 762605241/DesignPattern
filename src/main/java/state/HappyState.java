package state;

/**
 * 具体状态，及具体状态对应执行逻辑
 */
public class HappyState implements AbstractState {
    @Override
    public void doOperation() {
        System.out.println("我很开心......");
    }
}
