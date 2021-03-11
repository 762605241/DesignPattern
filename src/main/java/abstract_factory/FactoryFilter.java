package abstract_factory;


/**
 * 工厂选择
 * 根据参数，生成不同工厂
 */
public class FactoryFilter {
    public Factory getFactory(String type) {
        switch (type) {
            case "Phone":
                return new PhoneFactory();
            case "Computer":
                return new ComputerFactory();
            default:
                return null;
        }
    }
}
