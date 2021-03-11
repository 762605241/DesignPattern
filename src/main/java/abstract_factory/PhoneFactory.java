package abstract_factory;

/**
 * 具体某类产品工厂
 */
public class PhoneFactory extends Factory {

    @Override
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

    @Override
    public Computer getComputer(String brand) {
        return null;
    }
}
