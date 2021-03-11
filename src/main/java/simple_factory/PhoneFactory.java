package simple_factory;

/**
 * 工厂类
 * 根据参数返回具体品牌手机实例
 */
public class PhoneFactory {
    public Phone getPhone(String brand) {
        switch (brand) {
            case "xiaomi":
                return new XiaomiPhone();
            case "huawei":
                return new HuaweiPhone();
            default:
                return null;
        }
    }
}
