package factory_method;

/**
 * 具体工厂
 * 返回具体产品实例
 */
public class XiaomiPhoneFactory extends PhoneFactory {
    @Override
    Phone getPhone() {
        return new XiaomiPhone();
    }
}
