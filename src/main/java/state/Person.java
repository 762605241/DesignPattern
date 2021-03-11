package state;

public class Person {
    private AbstractState state;

    public AbstractState getState() {
        return state;
    }

    public void setState(AbstractState state) {
        this.state = state;
    }

    public void doOperation() {
        state.doOperation();
    }
}
