package proxy;

public class Main {
    public static void main(String[] args) {
        AbstractSource source = new Source();
        AbstractSource proxy = new Proxy(source);
        proxy.method();
    }
}
