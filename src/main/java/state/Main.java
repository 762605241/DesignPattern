package state;

public class Main {
    public static void main(String[] args) {
        AbstractState happy = new HappyState();
        AbstractState sad = new SadState();
        Person person = new Person();
        person.setState(happy);
        person.doOperation();
        person.setState(sad);
        person.doOperation();
    }
}
