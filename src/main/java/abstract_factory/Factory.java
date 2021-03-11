package abstract_factory;

/**
 * 全局工厂
 * 创建任何类型产品
 */
public abstract class Factory {
    public abstract Phone getPhone(String brand);
    public abstract Computer getComputer(String brand);
}
