package proxy;

public class Proxy extends AbstractSource {
    private AbstractSource abstractSource;

    public Proxy(AbstractSource abstractSource) {
        this.abstractSource = abstractSource;
    }

    @Override
    public void method() {
        System.out.println("代理对象控制访问");
        abstractSource.method();
    }
}
