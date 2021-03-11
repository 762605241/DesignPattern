package decorator;

import chain_of_responsibility.DebugeLogger;

/**
 * 装饰器对象
 * 集成被装饰的对象
 */
public class DecoratorSource extends AbstractSource {
    private AbstractSource source;

    public DecoratorSource(AbstractSource source) {
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("在远方前修饰");
        source.method();
        System.out.println("在远方后修饰");
    }

    public AbstractSource getSource() {
        return source;
    }

    public void setSource(AbstractSource source) {
        this.source = source;
    }
}
