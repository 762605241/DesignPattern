package state;

/**
 * 具体状态，即对应执行逻辑
 */
public class SadState implements AbstractState{
    @Override
    public void doOperation() {
        System.out.println("我很难过......");
    }
}
