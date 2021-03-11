package abstract_factory;

/**
 * 具体某类产品工厂
 */
public class ComputerFactory extends Factory {
    @Override
    public Computer getComputer(String brand){
        switch (brand) {
            case "xiaomi":
                return new XiaomiComputer();
            case "huawei":
                return new HuaweiComputer();
            default:
                return null;
        }
    }

    @Override
    public Phone getPhone(String brand) {
        return null;
    }
}
