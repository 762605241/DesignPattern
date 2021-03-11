package factory_method;

/**
 * 具体工厂
 * 返回具体产品实例
 */
public class HuaweiPhoneFactory extends PhoneFactory{
    @Override
    Phone getPhone() {
        return new HuaweiPhone();
    }
}
