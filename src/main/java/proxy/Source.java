package proxy;

/**
 * 实际对象
 */
public class Source extends AbstractSource{
    @Override
    public void method() {
        System.out.println("实际对象方法执行....");
    }
}
