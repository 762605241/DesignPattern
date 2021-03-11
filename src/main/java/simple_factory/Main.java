package simple_factory;

/**
 * 客户端
 * 获取具体产品
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 当工厂类中，获取产品的方法是静态方法是，则是静态工厂模式
         */
        PhoneFactory phoneFactory = new PhoneFactory();
        Phone phone1 = phoneFactory.getPhone("xiaomi");
        phone1.call();
        Phone phone2 = phoneFactory.getPhone("huawei");
        phone2.call();
    }
}
