package observer;

public class Main {
    public static void main(String[] args) {
        AbstractObserver keyUpObserver = new KeyUpObserver();
        AbstractObserver keyDownObserver = new KeyDownObserver();
        Key key = new Key();
        key.addObserver(keyDownObserver);
        key.addObserver(keyUpObserver);
        key.setKeyOption("w", "down");
        System.out.println();
        key.setKeyOption("w", "up");
    }
}
