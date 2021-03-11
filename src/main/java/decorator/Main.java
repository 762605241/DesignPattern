package decorator;

public class Main {
    public static void main(String[] args) {
        AbstractSource source = new Source();
        DecoratorSource decoratorSource = new DecoratorSource(source);
        decoratorSource.method();
    }
}
