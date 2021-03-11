package abstract_factory;

public class HuaweiPhone extends Phone{
    @Override
    public void call() {
        System.out.println("华为手机正在打电话......");
    }
}
